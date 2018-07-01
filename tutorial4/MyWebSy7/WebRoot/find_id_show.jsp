<%@ page language="java" contentType="text/html" pageEncoding="utf-8" import="java.sql.*" import="com.domain.Student"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><title>由id查询指定的记录的页面</title></head>
  
  <body><center>
  		<jsp:useBean id="a" class="com.domain.Student" scope="page"/>
  		<%a=(Student)request.getAttribute("st");  %>
  		
  		<table border="2" bgcolor="ccceee" width="650">
	     	<tr bgcolor="CCCCCC" align="center">
	     		<td>ID号</td><td>姓名</td><td>性别</td><td>年龄</td><td>体重</td><td>身高</td>
	     	</tr>
	     	<tr align="center">
	     		<td><%=a.getId() %></td>
	     		<td><%=a.getName() %></td>
	     		<td><%=a.getSex() %></td>
	     		<td><%=a.getAge() %></td>
	     		<td><%=a.getWeight() %></td>
	     		<td><%=a.getHight() %></td>
	     	</tr>
	     </table>
  		
  </center>
  

    	
  </body>
</html>
