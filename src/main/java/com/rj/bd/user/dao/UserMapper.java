package com.rj.bd.user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.rj.bd.user.entity.User;


/**
 * 
   @desc    User模块的持久层
 * @author  LYP
 * @time    2021-04-08
 *
 */
@Repository("userMapper")//该注解标识出当前的接口/模块即是持久层(Dao),userMapper说明当前这个是user模块的Dao,即可以理解为userDao
//等价的代码：<bean id="userMapper"  class="代理类(UserMapperProxy)"/>
public interface UserMapper {

@Select("  select * from user   ")
public List<User>  fiandAll();

@Insert("insert into user (id,name) values (#{id},#{name})")
public void save(User u);

@Select("select * from user where id=#{id}")
public User queryById(String id);

@Update("update user set name=#{name} where id=#{id}")
public void updateUser(User user);

@Delete("delete from user where id=#{id}")
public void deleteUser(String id);




	
}
