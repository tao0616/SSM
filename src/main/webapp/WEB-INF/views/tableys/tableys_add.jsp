<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>tableys模块的添加</title>
</head>
<body>

     <form action="<%=request.getContextPath()%>/Tableys/add.action">
        <table>
         
         <tr>
         <td>桌子名字：</td>
         <td><input  type="text"  name="t_name"  value=""/></td>
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