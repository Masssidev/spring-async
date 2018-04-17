package com.async.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.async.domain.Student;
import com.async.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("list")
	public String list(Model model) {
		List<Student> list = studentService.findAll();
		model.addAttribute("list", list);
		return "student/list";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit(Model model, @RequestParam("id") int id) {
		Student student = studentService.findOne(id);
		model.addAttribute("student", student);
		return "student/edit";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(Student student, Model model) {
		studentService.save(student);
		model.addAttribute("message", "저장했습니다.");
		return "student/edit";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("title", "등록");
		return "student/edit";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(Student student, Model model) {
		studentService.save(student);
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(@RequestParam("id") int id, Model model) {
		studentService.delete(id);
		return "redirect:list";
	}

}
