package com.hz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hz.dto.Student;

/**
 * @author OS
 *
 */
@Repository
public class StudentDao implements BaseDao<Student> {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#insert(java.lang.Object)
	 */
	@Override
	public boolean insert(Student t) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		return t.getId() > 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public boolean update(Student t) {
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
	public List<Student> getList() {
		Session session = sessionFactory.openSession();
		Query<Student> query = session.createQuery("from Student", Student.class);
		return query.getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#getById(int)
	 */
	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
