package com.lovely.restDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lovely.restDemo.model.Email;

public interface EmailRepo extends JpaRepository<Email, Integer> {
	@Query("Select e from e where e.to=:to")
	List<Email>findByTo(String to);
	@Query("select e from email e where e.from=:from")
	List<Email>findByFrom(String from);

}
