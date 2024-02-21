package com.tcs.sgb.ws.utils;

import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

public class SgbAdapter {
	public String callResAPI(String msg, String url) throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		System.out.println("send request to corebank: " + msg + " to uri : " + post.getURI().toString());

		client = createHttpClient_AcceptsUntrustedCerts();

		StringEntity input = new StringEntity(msg, "UTF-8");
		input.setContentType("application/json");
		post.setEntity(input);
//		post.setHeader("Authorization", "Bearer "+token);
		// post.setHeader("Authorization", token);
		post.setHeader("Authorization", "Bearer " + SgbConstant.TOKEN);
		HttpResponse responses = client.execute(post);
		String result = new String(EntityUtils.toByteArray(responses.getEntity()), Charset.forName("UTF-8"));
		System.out.println(" response corebank: " + result);
		client.getConnectionManager().shutdown();

		return result;
	}

	public String callAPILogin(String msg,String url) throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);

		client = createHttpClient_AcceptsUntrustedCerts();
		

		StringEntity input = new StringEntity(msg, "UTF-8");
		input.setContentType("application/json");
		post.setEntity(input);
		HttpResponse responses = client.execute(post);
		String result = new String(EntityUtils.toByteArray(responses.getEntity()), Charset.forName("UTF-8"));
		System.out.println(" response corebank: " + result);
		client.getConnectionManager().shutdown();

		return result;
	}
	

	private HttpClient createHttpClient_AcceptsUntrustedCerts()
			throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
		HttpClientBuilder b = HttpClientBuilder.create();

		// setup a Trust Strategy that allows all certificates.
		//
		SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
			public boolean isTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
				return true;
			}
		}).build();
		b.setSslcontext(sslContext);

		// don't check Hostnames, either.
		// -- use SSLConnectionSocketFactory.getDefaultHostnameVerifier(), if you don't
		// want to weaken
		HostnameVerifier hostnameVerifier = SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;

		// here's the special part:
		// -- need to create an SSL Socket Factory, to use our weakened "trust
		// strategy";
		// -- and create a Registry, to register it.
		//
		SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);
		Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
				.register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", sslSocketFactory)
				.build();

		// now, we create connection-manager using our Registry.
		// -- allows multi-threaded use
		PoolingHttpClientConnectionManager connMgr = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
		b.setConnectionManager(connMgr);

		// finally, build the HttpClient;
		// -- done!
		HttpClient client = b.build();
		return client;
	}
}
