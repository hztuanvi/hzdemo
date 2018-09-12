package com.hz.dao;

import java.util.List;

/**
 * @author OS
 *
 */
public interface BaseDao<T> {

	boolean insert(T t);

	boolean update(T t);

	boolean delete(int id);

	List<T> getList();

	T getById(int id);
}
