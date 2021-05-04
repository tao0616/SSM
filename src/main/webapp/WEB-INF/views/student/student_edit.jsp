<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student模块的修改</title>
</head>
<body>

     <form action="<%=request.getContextPath()%>/student/edit">
        <table>
         <tr>
         	<td>学生姓名：</td>
	         <td> 
	         <input  type="hidden"  name="s_id"  value="${student.s_id}"/>
	         <input  type="text"  name="s_name"  value="${student.s_name}"/>
	         </td>
	         
         </tr>
         <tr>
         <td>教室id：</td>
	         <td> 
	         <input  type="text"  name="c_id"  value="${student.c_id}"/>
	         </td>
         </tr>
         
          <tr>
           <td colspan="2">
             <input  type="submit"  value="保存"  />
           </td>
          </tr>
        
        </table>
     
     
     </form>



</body>
</html>