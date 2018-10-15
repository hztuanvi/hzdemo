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

	@Override
	public boolean insert(Student t) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
		return t.getId() > 0;
	}

	@Override
	public boolean update(Student t) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();
		session.close();
		return t.getId() > 0;
	}

	@Override
	public boolean delete(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(getById(id));
		session.getTransaction().commit();
		return true;
	}

	public List<Student> getList(int page, int maxRecords) {
		Session session = sessionFactory.openSession();
		Query<Student> query = session.createQuery("from student", Student.class);
		// query.setMaxResults(maxRecords);
		// query.setFirstResult(page);
		return query.getResultList();
	}

	@Override
	public Student getById(int id) {
		Session session = sessionFactory.openSession();
		return session.get(Student.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.dao.BaseDao#getList()
	 */
	@Override
	public List<Student> getList() {
		Session session = sessionFactory.openSession();
		Query<Student> query = session.createQuery("from student", Student.class);
		return query.getResultList();
	}

}
