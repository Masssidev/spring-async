package com.async.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.async.domain.Student;
import com.async.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student findOne(int id) {
		return studentRepository.findOne(id);
	}

	@Async
	public void save(Student student) {
		studentRepository.save(student);
	}
	
	@Async
	public void delete(int id){
		studentRepository.delete(id);
	}
}
