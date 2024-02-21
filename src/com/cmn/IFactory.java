package com.cmn;

public interface IFactory<T, O> {
	public void register(T type, O bean);
	public O get(T type);
}
