package com.async.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.async.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
