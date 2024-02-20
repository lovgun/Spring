package com.lovely.spring_boot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lovely.spring_boot_demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
