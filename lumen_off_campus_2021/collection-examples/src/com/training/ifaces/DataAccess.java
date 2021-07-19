package com.training.ifaces;

import java.util.Collection;

public interface DataAccess<T> {

	public boolean add(T t);
	public boolean addAll(T...t);
	public Collection<T> get();
}
