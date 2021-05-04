package com.rj.bd.user.entity;

/**
 * @desc User模块的实体类
 * @author LYP
 * @time 2021-04-08
 * 
 */
public class User {

	public String id;
	public String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
