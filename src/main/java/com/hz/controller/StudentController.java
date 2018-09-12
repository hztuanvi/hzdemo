package com.hz.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hz.dto.Student;
import com.hz.form.StudentForm;
import com.hz.service.ClassRoomService;
import com.hz.service.RoomService;
import com.hz.service.StudentService;

/**
 * @author OS
 *
 */
@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private ClassRoomService classRoomService;

	@Autowired
	private RoomService roomService;

	// ======== ===========
	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping
	public String index(Model model) {
		model.addAttribute("studentList", studentService.getList());
		return "students/index";
	}

	@RequestMapping("/input")
	public String input(Model model) {
		model.addAttribute("studentForm", new StudentForm());
		init(model);
		return "students/input";
	}

	@RequestMapping(value = "/doInput", method = RequestMethod.POST)
	public String doInput(@Valid StudentForm studentForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			init(model);
			return "students/input";
		}
		Student student = modelMapper.map(studentForm, Student.class);
		studentService.insert(student);
		return "redirect:/student";
	}

	private void init(Model model) {
		model.addAttribute("classRoomList", classRoomService.getList());
		model.addAttribute("roomList", roomService.getList());
	}
}
