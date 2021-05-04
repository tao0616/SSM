package com.rj.bd.classs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.rj.bd.classs.entity.Classes;
@Repository("classesMapper")
public interface ClassesMapper {
	
	@Select("select * from classes")
	List<Classes> findAll();
	
	@Insert("insert into classes (c_id,c_name) values (#{c_id},#{c_name})")
	void save(Classes classes);
	
	@Select("select * from classes where c_id=#{c_id}")
	Classes queryClassesById(String c_id);

	@Update("update classes set c_name=#{c_name} where c_id=#{c_id}")
	void updateClasses(Classes classes);

	@Delete("delete from classes where c_id=#{c_id}")
	void deleteClasses(String c_id);

}
