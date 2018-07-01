<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> <title>JavaBean访问数据库</title>   </head>
  
  <body>
  	<center>
  		<jsp:useBean id="a" class="com.dao.StudentDAO" scope="page"/>
	  	
	  	
	  	你要查询的数据表中共有
	  	
	  	 <font size="5" color="red"><%=a.findAll().size() %></font>个用户
	     <table border="2" bgcolor="ccceee" width="650">
	     	<tr bgcolor="CCCCCC" align="center">
	     		<td>记录条数</td><td>ID号</td><td>姓名</td>
	     		<td>性别</td>
	     	</tr>
	     <%
	     	for(int i=a.findAll().size()-1;i>=0;i--){
	     %><tr align="center">
	     		<td><%=a.findAll().size()-i %></td>
	     		<td><%=a.findAll().get(i).getId() %></td>
	     		<td><%=a.findAll().get(i).getName() %></td>
	     		<td><%=a.findAll().get(i).getSex() %></td>
	     	</tr>
	     	<%} %>
	     </table>
	    
    
    </center>
  </body>
</html>
