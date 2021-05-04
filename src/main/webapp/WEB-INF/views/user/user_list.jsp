<%@page import="com.rj.bd.user.entity.User"   isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User模块的查询</title>
</head>
<body>

      <form action=""  method="post">
       <table  border="2px"  bordercolor="green" align="center">
       <tr>
       <td>序号</td>
       <td>姓名</td>
        <td>操作</td>
       </tr>
       
       
       
       <c:forEach  items="${list}"  var="user"   varStatus="i">
     
       <tr>
       <td>${i.count}</td>
       <td>${user.name}</td>
         <td>
			<a href="<%=request.getContextPath()%>/user/addPage.action">添加</a>
			<a href="<%=request.getContextPath()%>/user/editPage.action?id=${user.id}">修改</a>
			<a href="<%=request.getContextPath()%>/user/delete.action?id=${user.id}">删除</a>
           </td>
       </tr>
       </c:forEach>
     
       
       
       </table>
      
      
      
      
      </form>




</body>
</html>