package com.rj.bd.classs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.classs.dao.ClassesMapper;
import com.rj.bd.classs.entity.Classes;
import com.rj.bd.student.dao.StudentMapper;
import com.rj.bd.user.dao.UserMapper;

@Service("classesService")
public class ClassesServiceImpl implements IClassesService{

	@Autowired
	public ClassesMapper classesMapper;
	
	public List<Classes> findAll() {
		return classesMapper.findAll();
	}

	public void save(Classes classes) {
		classesMapper.save(classes);
	}

	public Classes queryClassesById(String c_id) {
		return classesMapper.queryClassesById(c_id);
	}

	public void updateClasses(Classes classes) {
		classesMapper.updateClasses(classes);
	}

	public void deleteClasses(String c_id) {
		classesMapper.deleteClasses(c_id);
	}
	
	
}
