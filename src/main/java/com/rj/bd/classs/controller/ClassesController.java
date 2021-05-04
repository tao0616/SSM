package com.rj.bd.classs.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rj.bd.classs.entity.Classes;
import com.rj.bd.classs.service.IClassesService;
import com.rj.bd.user.entity.User;

@Controller
@RequestMapping("/classes")
public class ClassesController {
	
	@Autowired
	public IClassesService classesService;
	
	@RequestMapping("/query")
	public String queryUser(HttpServletRequest request){
		
		List<Classes> list = classesService.findAll();
		
		System.out.println("--------------->"+list.size());
		
		request.setAttribute("list", list);//将带有数据的list传递给前台的查询展示页面
		
		for (Classes classes : list) {
			System.out.println(classes);
		}
		
		return "classes/classes_list";
	}
	
	@RequestMapping("/addPage")	
	public String addPage(){
		System.out.println("-------进入Classes模块的添加页面------》");
		return "classes/classes_add";
	}	
	
	
	
	@RequestMapping("/add")	
	public String add(Classes classes){
		System.out.println("-------add()------》");
		classesService.save(classes);
		return "redirect:/classes/query.action";
	}
	
	@RequestMapping("/editPage")
	public String editPage(HttpServletRequest request,@RequestParam(value="c_id")String c_id){
		System.out.println("进入User模块的添加页面");
		Classes classes = classesService.queryClassesById(c_id);
		request.setAttribute("classes", classes);
		return "/classes/classes_edit";

	}
	
	@RequestMapping("edit")
	public String edit(Classes classes){
		System.out.println("edit");
		
		classesService.updateClasses(classes);
		System.out.println(classes);
		return "redirect:/classes/query.action";
	}
	
	
	@RequestMapping("delete")
	public String delete(@RequestParam(value="c_id")String c_id){
		
		
		classesService.deleteClasses(c_id);
		
		return "redirect:/classes/query.action";
	}
	
}
