package com.hz.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String index(Model model, Pageable pageable) {
		int page = pageable.getPageNumber() > 0 ? pageable.getPageNumber() : 1;
		int maxRecords = pageable.getPageSize();
		model.addAttribute("studentList", studentService.getList(page, maxRecords));
		return "students/index";
	}

	@RequestMapping("/input")
	public String showInput(Model model) {
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

	@RequestMapping("/update")
	public String showUpdate(@RequestParam int id, Model model) {
		model.addAttribute("studentForm", studentService.getById(id));
		init(model);
		return "students/update";
	}

	@RequestMapping(value = "/doUpdate", method = RequestMethod.POST)
	public String doUpdate(@Valid StudentForm studentForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			init(model);
			return "students/update";
		}
		Student student = modelMapper.map(studentForm, Student.class);
		studentService.update(student);
		return "redirect:/student";
	}

	@RequestMapping("/delete")
	public String doDelete(@RequestParam int id) {
		studentService.delete(id);
		return "redirect:/student";
	}
}
