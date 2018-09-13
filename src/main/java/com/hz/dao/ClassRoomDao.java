package com.hz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hz.dto.ClassRoom;

/**
 * @author OS
 *
 */
@Repository
public class ClassRoomDao implements BaseDao<ClassRoom> {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#insert(java.lang.Object)
	 */
	@Override
	public boolean insert(ClassRoom t) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public boolean update(ClassRoom t) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#delete(int)
	 */
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#getList()
	 */
	@Override
	public List<ClassRoom> getList() {
		Session session = sessionFactory.openSession();
		Query<ClassRoom> query = session.createQuery("from classroom", ClassRoom.class);
		return query.getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#getById(int)
	 */
	@Override
	public ClassRoom getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
