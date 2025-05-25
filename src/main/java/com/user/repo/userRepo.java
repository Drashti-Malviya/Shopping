package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.UserModel;

@Repository
public interface userRepo extends  JpaRepository<UserModel,Integer>{

}
