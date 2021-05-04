package com.rj.bd.tableys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.rj.bd.tableys.entity.Tableys;

@Repository("TableysMapper")
public interface TableysMapper {

	@Select("select * from Tableys")
	List<Tableys> findAll();

	@Insert("insert into tableys (t_name) values (#{t_name})")
	void save(Tableys tableys);
	
	@Delete("delete from tableys where t_id=#{t_id}")
	void deleteTableys(String t_id);

	@Select("select * from tableys where t_id=#{t_id}")
	Tableys queryTableysById(String t_id);
	
	@Update("update tableys set t_name=#{t_name} where t_id=#{t_id}")
	void updateTableys(Tableys tableys);

}
