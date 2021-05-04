package com.rj.bd.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.user.dao.UserMapper;
import com.rj.bd.user.entity.User;


@Service("userService")//该注解的意思为标识出当前的类/模块是一个M层，且当前这个Service的值为userService
//等价的代码：<bean id="userService" class="pro.yf.bj.user.service.UserServiceImpl"/>
public class UserServiceImpl   implements   IUserService{

	@Autowired
	private UserMapper userMapper;
	
	
	
	public List<User> findAll() {
		
		return userMapper.fiandAll();
	}



	public void save(User u) {
          userMapper.save(u);		
	}



	public User queryUserById(String id) {
		return userMapper.queryById(id);
	}



	public void updateUser(User user) {
		userMapper.updateUser(user);
	}



	public void deleteUser(String id) {
		userMapper.deleteUser(id);
	}

	
	
}
