package com.user.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductModel;
import com.user.UserModel;
import com.user.service.userService;



// below 2 annotation should be use in controller class only,otherwise request will not sent properly

@RestController
@RequestMapping("/userRestImpl")
public class userRestImpl implements userRest{
	
	@Autowired
	userService uservice;

	@Override
	public String registerUser(@RequestBody UserModel user) {
		return uservice.registerUser(user);
	}

	@Override
	public UserModel getUser(Integer id) {
		return uservice.getUser(id);
	}

//	@Override
//	public ResponseEntity<List<ProductModel>> loginUser(Integer userId, String password) {
//		return uservice.loginUser(userId,password);
//	}

	
}
