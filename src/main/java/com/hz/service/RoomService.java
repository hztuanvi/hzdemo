package com.hz.service;

import java.util.List;

import com.hz.dao.RoomDao;
import com.hz.dto.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author VyDT
 *
 */
@Service
public class RoomService implements BaseService<Room> {

	@Autowired
	private RoomDao roomDao;
	
	@Override
	public List<Room> getList() {
		// TODO Auto-generated method stub
		return roomDao.getList();
	}

	@Override
	public Room getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Room t) {
		// TODO Auto-generated method stub
		return false;
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
