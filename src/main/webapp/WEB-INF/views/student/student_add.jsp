<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student模块的添加</title>
</head>
<body>

     <form action="<%=request.getContextPath()%>/student/add.action">
        <table>
         <tr>
         <td>学生id：</td>
         <td><input  type="text"  name="s_id"  value=""/></td>
         </tr>
         
         <tr>
         <td>学生姓名：</td>
         <td><input  type="text"  name="s_name"  value=""/></td>
         </tr>
         
         <tr>
         <td>教室id：</td>
         <td><input  type="text"  name="c_id"  value=""/></td>
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