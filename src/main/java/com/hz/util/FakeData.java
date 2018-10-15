package com.hz.util;

import java.util.Random;

import com.hz.dto.Student;
import com.hz.service.StudentService;

/**
 * @author OS
 *
 */
public class FakeData {

	static StudentService studentService = new StudentService();

	public static void main(String[] args) {
		Random rd = new Random();
		for (int i = 1; i < 100; i++) {
			Student st = new Student();
			st.setName("Student " + i);
			st.setGender(rd.nextBoolean());
			st.setClassRoomId(String.valueOf(rd.nextInt(2)));
			st.setRoomId(String.valueOf(rd.nextInt(2)));
			st.setDelFlg(false);
			st.setPhoneNumber("0123456789" + i);
			studentService.insert(st);
		}
	}
}
