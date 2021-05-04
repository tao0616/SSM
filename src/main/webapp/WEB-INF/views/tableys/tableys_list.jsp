<%@page import="com.rj.bd.tableys.entity.Tableys"   isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tableys模块的查询</title>
</head>
<body>

      <form action=""  method="post">
       <table  border="2px"  bordercolor="green" align="center">
       <tr>
       <td>桌子id</td>
       <td>学生姓名</td>
        <td>操作</td>
       </tr>
       
       
       
       <c:forEach  items="${list}"  var="tableys"   varStatus="i">
     
       <tr>
       <td>${tableys.t_id}</td>
       <td>${tableys.t_name}</td>
         <td>
             <a href="<%=request.getContextPath()%>/Tableys/addPage.action">添加</a>
             
              <a href="<%=request.getContextPath()%>/Tableys/editPage?t_id=${tableys.t_id}">修改</a>
              <a href="<%=request.getContextPath()%>/Tableys/delete?t_id=${tableys.t_id}">删除</a>
           </td>
       </tr>
       </c:forEach>
     
       
       
       </table>
      
      
      
      
      </form>




</body>
</html>