<%@page import="com.rj.bd.student.entity.Student"   isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student模块的查询</title>
</head>
<body>

      <form action=""  method="post">
       <table  border="2px"  bordercolor="green" align="center">
       <tr>
       <td>学生id</td>
       <td>学生姓名</td>
       <td>教室id</td>
        <td>操作</td>
       </tr>
       
       
       
       <c:forEach  items="${list}"  var="student"   varStatus="i">
     
       <tr>
       <td>${student.s_id}</td>
       <td>${student.s_name}</td>
       <td>${student.c_id}</td>
         <td>
             <a href="<%=request.getContextPath()%>/student/addPage.action">添加</a>
              <a href="<%=request.getContextPath()%>/student/editPage?s_id=${student.s_id}">修改</a>
              <a href="<%=request.getContextPath()%>/student/delete?s_id=${student.s_id}">删除</a>
           </td>
       </tr>
       </c:forEach>
     
       
       
       </table>
      
      
      
      
      </form>




</body>
</html>