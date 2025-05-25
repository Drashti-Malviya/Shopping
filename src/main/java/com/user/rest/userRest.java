package com.user.rest;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.ProductModel;
import  com.user.UserModel;



public interface userRest {
	
//dao 
//dto
	@PostMapping("/registerUser")
	public  String registerUser(@RequestBody UserModel user);	
	
	
	
	
	@GetMapping("/getUser/{id}")
	public UserModel getUser(@PathVariable Integer id);
	
	
	
	
//	@GetMapping("/loginUser/{userId}/{password}")
//	public ResponseEntity<List<ProductModel>>loginUser(@PathVariable Integer userId,@PathVariable String password);
//	
	

}

