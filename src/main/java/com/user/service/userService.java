package com.user.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.ProductModel;
import com.user.UserModel;

public interface userService {

	String registerUser(UserModel user);

	UserModel getUser(Integer id);

	//ResponseEntity<List<ProductModel>> loginUser(Integer userId, String password);
	
}