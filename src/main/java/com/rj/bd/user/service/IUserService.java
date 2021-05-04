package com.rj.bd.user.service;

import java.util.List;
import java.util.Map;

import com.rj.bd.user.entity.User;


public interface IUserService {

	public List<User>  findAll();

	public void save(User u);

	public User queryUserById(String id);
	

	public void updateUser(User user);

	public void deleteUser(String id);
}
