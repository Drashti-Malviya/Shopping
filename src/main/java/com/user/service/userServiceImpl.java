package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ProductModel;
import com.user.UserModel;
import com.user.repo.userRepo;

import ch.qos.logback.classic.Logger;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	userRepo urepo;
	
	@Autowired
    private RestTemplate restTemplate;


	
	

	@Override
	public String registerUser(UserModel user) {
		
	    System.out.println("Received User: " + user);

		
//		UserModel user1 = new UserModel();
//		user1.setUserId(100);
//		user1.setContact("838401943");
//		user1.setEmailAddress("ds@gmail.com");
//		user1.setFirstName("shraddha");
//		user1.setLastName("veere");
		
		urepo.save(user);
		return "user is created";
	}

	@Override
	public UserModel getUser(Integer id) {
		
		Optional<UserModel> findById = urepo.findById(id);
		
		if(findById.isPresent())			
			return findById.get();
		return findById.get();		
	}

//	@Override
//	public ResponseEntity<List<ProductModel>> loginUser(Integer userId, String password) {
//		System.out.println("userId........................................"+userId);
//		UserModel user = getUser(userId);
//		if(user!=null) {
//		
//		 ResponseEntity<List<ProductModel>> exchange = restTemplate.exchange(
//			    "http://localhost:8082/productRestImpl/getAllProductList", 
//			    HttpMethod.GET, 
//			    null, 
//			    new ParameterizedTypeReference<List<ProductModel>>() {}
//			);
//		return exchange;}
//		
//		     return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
//	}

	
	
		}

 