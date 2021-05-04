package com.rj.bd.tableys.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rj.bd.tableys.entity.Tableys;
import com.rj.bd.tableys.service.ITableysService;
import com.rj.bd.user.entity.User;

@Controller
@RequestMapping("/Tableys")
public class TableysController {
	
	@Autowired
	public ITableysService tableysService;
	
	@RequestMapping("/query")
	public String queryTableys(HttpServletRequest request){
		
		List<Tableys> list = tableysService.findAll();
		
		
		request.setAttribute("list", list);//将带有数据的list传递给前台的查询展示页面
		
		for (Tableys tableys : list) {
			System.out.println(tableys);
		}
		
		return "tableys/tableys_list";
	}
	
	@RequestMapping("/addPage")	
	public String addPage(){
		System.out.println("-------进入Tableys模块的添加页面------》");
		return "tableys/tableys_add";
	}	
	
	
	
	@RequestMapping("/add")	
	public String add(Tableys tableys){
		System.out.println("-------add()------》");
		tableysService.save(tableys);
		return "redirect:/Tableys/query.action";
	}
	
	@RequestMapping("/editPage")
	public String editPage(HttpServletRequest request,@RequestParam(value="t_id")String t_id){
		System.out.println("进入Tableys模块的添加页面");
		Tableys tableys = tableysService.queryTableysById(t_id);
		request.setAttribute("tableys", tableys);
		return "/tableys/tableys_edit";

	}
	
	@RequestMapping("edit")
	public String edit(Tableys tableys){
		System.out.println("edit");
		
		tableysService.updateTableys(tableys);
		System.out.println(tableys);
		return "redirect:/Tableys/query.action";
	}
	
	
	@RequestMapping("delete")
	public String delete(@RequestParam(value="t_id")String t_id){
		
		
		tableysService.deleteTableys(t_id);
		
		return "redirect:/Tableys/query.action";
	}
	
}
