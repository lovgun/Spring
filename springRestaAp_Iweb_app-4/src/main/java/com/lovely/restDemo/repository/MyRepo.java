package com.lovely.restDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lovely.restDemo.model.Product;

public interface MyRepo extends JpaRepository<Product , Integer>{

}
