package com.lovely.dao;

import org.springframework.stereotype.Component;

import com.lovely.model.UserDto;

@Component
public class Dao {
	public void saveDTO(UserDto dto){
		EntityManagerFactory entityManagerFactory=persistence.createEntityManagerFactory("user");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTarnsaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		entityManager.close();
		
		
	}

}
