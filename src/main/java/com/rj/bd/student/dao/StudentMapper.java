package com.rj.bd.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.rj.bd.classs.entity.Classes;
import com.rj.bd.student.entity.Student;

@Repository("studentMapper")
public interface StudentMapper {

	@Select("select * from student")
	List<Student> queryAll();

	@Insert("insert into student(s_id,s_name,c_id) values (#{s_id},#{s_name},#{c_id}) ")
	void save(Student student);

	@Select("select * from student where s_id=#{s_id}")
	Student queryStudentById(String s_id);
	
	@Update("update student set s_name=#{s_name},c_id=#{c_id} where s_id=#{s_id}")
	void updateStudent(Student student);

	@Delete("delete from student where s_id=#{s_id}")
	void deleteStudent(String s_id);

	
	
	

}
