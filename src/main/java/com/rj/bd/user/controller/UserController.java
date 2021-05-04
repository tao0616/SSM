package com.rj.bd.user.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rj.bd.user.entity.User;
import com.rj.bd.user.service.IUserService;

/**
 * 
   @desc    User模块的控制器
 * @author  LYP
 * @time    2021-04-08
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired//自动装配：一个名字叫userService的bean,从Springmvc框架扫描到的@Service注解中去寻找
	public IUserService  userService;//等注入成功之后的效果相当于：IUserService userService=new UserServiceImpl()
	
	
	
	
	
	@RequestMapping("/query")
	public String queryUser(HttpServletRequest request){
		System.out.println("UserController:queryUser()");
		
		List<User> list = userService.findAll();
		
		System.out.println("--------------->"+list.size());
		
		request.setAttribute("list", list);//将带有数据的list传递给前台的查询展示页面
		
		for (User user : list) {
			System.out.println(user.getId()+"\t"+user.getName());
		}
		
		return "user/user_list";
	}
	
	
	@RequestMapping("/addPage")	
	public String addPage(){
		System.out.println("-------进入User模块的添加页面------》");
		return "user/user_add";
	}	
	
	

	@RequestMapping("/add")	
	public String add(User u){
		System.out.println("-------add()------》");
		u.setId(UUID.randomUUID().toString());
		userService.save(u);
		//重定向：redirect:/user/query.action
		return "redirect:/user/query.action";
	}
	
	@RequestMapping("/editPage")
	public String editPage(HttpServletRequest request,@RequestParam(value="id")String id){
		System.out.println("进入User模块的添加页面");
		User user = userService.queryUserById(id);
		request.setAttribute("user", user);
		return "/user/user_edit";

	}
	
	@RequestMapping("edit")
	public String edit(User user){
		System.out.println("edit");
		
		userService.updateUser(user);
		System.out.println(user);
		return "redirect:/user/query.action";
	}
	
	
	@RequestMapping("delete")
	public String delete(@RequestParam(value="id")String id){
		
		
		userService.deleteUser(id);
		
		return "redirect:/user/query.action";
	}

	
}
