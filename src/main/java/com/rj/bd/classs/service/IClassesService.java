package com.rj.bd.classs.service;

import java.util.List;

import com.rj.bd.classs.entity.Classes;

public interface IClassesService {

	List<Classes> findAll();

	void save(Classes classes);

	Classes queryClassesById(String c_id);

	void updateClasses(Classes classes);

	void deleteClasses(String c_id);
	
}
