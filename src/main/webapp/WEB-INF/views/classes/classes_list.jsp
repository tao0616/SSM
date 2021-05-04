<%@page import="com.rj.bd.classs.entity.Classes"   isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Classes模块的查询</title>
</head>
<body>

      <form action=""  method="post">
       <table  border="2px"  bordercolor="green" align="center">
       <tr>
       <td>教室id</td>
       <td>教室名称</td>
        <td>操作</td>
       </tr>
       
       
       
       <c:forEach  items="${list}"  var="classes"   varStatus="i">
     
       <tr>
       <td>${classes.c_id}</td>
       <td>${classes.c_name}</td>
         <td>
             <a href="<%=request.getContextPath()%>/classes/addPage.action">添加</a>
              <a href="<%=request.getContextPath()%>/classes/editPage?c_id=${classes.c_id}">修改</a>
              <a href="<%=request.getContextPath()%>/classes/delete?c_id=${classes.c_id}">删除</a>
           </td>
       </tr>
       </c:forEach>
     
       
       
       </table>
      
      
      
      
      </form>




</body>
</html>