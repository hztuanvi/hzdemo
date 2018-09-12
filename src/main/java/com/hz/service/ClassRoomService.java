package com.hz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hz.dao.ClassRoomDao;
import com.hz.dto.ClassRoom;

/**
 * @author OS
 *
 */
@Service
public class ClassRoomService implements BaseService<ClassRoom> {

	@Autowired
	private ClassRoomDao classRoomDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#insert(java.lang.Object)
	 */
	@Override
	public boolean insert(ClassRoom t) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public boolean update(ClassRoom t) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#delete(int)
	 */
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#getList()
	 */
	@Override
	public List<ClassRoom> getList() {
		return classRoomDao.getList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#getById(int)
	 */
	@Override
	public ClassRoom getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
