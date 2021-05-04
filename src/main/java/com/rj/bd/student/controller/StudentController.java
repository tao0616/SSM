package com.rj.bd.student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rj.bd.student.entity.Student;
import com.rj.bd.student.service.IStudentService;
import com.rj.bd.user.entity.User;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired //自动装配
	public IStudentService studentService;
	
	@RequestMapping(value="/query")
	public String queryStudent(HttpServletRequest request){
		System.out.println("StudentController");
		List<Student> list = studentService.queryAll();
		request.setAttribute("list", list);
		for (Student student : list) {
			System.out.println(student);
		}
		return "student/student_list";
		
	}
	
	@RequestMapping("/addPage")
	public String addPage(){
		System.out.println("进入添加界面");
		
		return "student/student_add";
	}

	@RequestMapping("/add")
	public String add(Student student){
		System.out.println("add");
		
		studentService.save(student);
		
		return "redirect:/student/query.action";
	}
	
	@RequestMapping("/editPage")
	public String editPage(HttpServletRequest request,@RequestParam(value="s_id")String s_id){
		System.out.println("进入User模块的添加页面");
		Student student = studentService.queryStudentById(s_id);
		request.setAttribute("student", student);
		return "/student/student_edit";

	}
	
	@RequestMapping("edit")
	public String edit(Student student){
		System.out.println("edit");
		
		studentService.updateStudent(student);
		System.out.println(student);
		return "redirect:/student/query.action";
	}
	
	@RequestMapping("delete")
	public String delete(@RequestParam(value="s_id")String s_id){
		
		
		studentService.deleteStudent(s_id);
		
		return "redirect:/student/query.action";
	}
	
}
