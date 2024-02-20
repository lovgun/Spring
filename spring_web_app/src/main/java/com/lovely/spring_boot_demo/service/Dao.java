package com.lovely.spring_boot_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lovely.spring_boot_demo.model.Student;
import com.lovely.spring_boot_demo.repository.StudentRepo;

@Component
public class Dao {
	
	@Autowired
	StudentRepo repo;

	public void save(Student st) {
		// TODO Auto-generated method stub
		repo.save(st);
		
	}

	public List<Student> view() {
		// TODO Auto-generated method stub
		List<Student> findAll =repo.findAll();
		return findAll;
	}
	
	public Student edit(int id) {
		Student st=repo.findById(id).orElse(null);
		return st;
	}

	public void update(Student st) {
		// TODO Auto-generated method stub
		Student update=repo.findById(st.getId()).orElse(null);
		update.setName(st.getName());
		update.setPass(st.getPass());
		update.setAge(st.getAge());
		update.setAddress(st.getAddress());
        repo.save(update);		
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}
	
	

}
