package com.rj.bd.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.student.dao.StudentMapper;
import com.rj.bd.student.entity.Student;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	public StudentMapper studentMapper;
	
	public List<Student> queryAll() {
		return studentMapper.queryAll();
	}

	public void save(Student student) {
		studentMapper.save(student);
	}

	public Student queryStudentById(String s_id) {
		return studentMapper.queryStudentById(s_id);
	}

	public void updateStudent(Student student) {
		studentMapper.updateStudent(student);
	}

	public void deleteStudent(String s_id) {
		studentMapper.deleteStudent(s_id);
	}
	
	
}
