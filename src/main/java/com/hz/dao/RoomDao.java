package com.hz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hz.dto.Room;

@Repository
public class RoomDao implements BaseDao<Room> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Room> getList() {
		Session session = sessionFactory.openSession();
		Query<Room> query = session.createQuery("from room", Room.class);
		return query.getResultList();
	}

	@Override
	public Room getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Room t) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		return t.getId() > 0;
	}

	@Override
	public boolean update(Room t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
