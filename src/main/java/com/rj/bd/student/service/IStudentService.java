package com.rj.bd.student.service;

import java.util.List;

import com.rj.bd.student.entity.Student;

public interface IStudentService {

	List<Student> queryAll();

	void save(Student student);

	Student queryStudentById(String s_id);

	void updateStudent(Student student);

	void deleteStudent(String s_id);

}
