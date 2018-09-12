package com.hz.service;

import java.util.List;

/**
 * @author OS
 * @param <T>
 *
 */
public interface BaseService<T> {

	boolean insert(T t);

	boolean update(T t);

	boolean delete(int id);

	List<T> getList();

	T getById(int id);
}
