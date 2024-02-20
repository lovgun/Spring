package com.lovely.spring_boot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lovely.spring_boot_demo.model.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

}
