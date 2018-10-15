package com.hz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hz.dao.StudentDao;
import com.hz.dto.Student;

/**
 * @author OS
 *
 */
@Service
public class StudentService implements BaseService<Student> {

	@Autowired
	private StudentDao studentDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#insert(java.lang.Object)
	 */
	@Override
	public boolean insert(Student t) {
		return studentDao.insert(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public boolean update(Student t) {
		return studentDao.update(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#delete(int)
	 */
	@Override
	public boolean delete(int id) {
		return studentDao.delete(id);
	}

	public List<Student> getList(int page, int maxRecords) {
		// TODO Auto-generated method stub
		return studentDao.getList(page, maxRecords);
	}

	@Override
	public List<Student> getList() {
		// TODO Auto-generated method stub
		return studentDao.getList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hz.service.BaseService#getById(int)
	 */
	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getById(id);
	}

}
