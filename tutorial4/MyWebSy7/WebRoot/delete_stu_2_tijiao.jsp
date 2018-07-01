<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><title>删除条件提交页面</title></head>
  
  <body>
    请选择删除记录条件<hr width="100%" size="3">
    <form action="delete" method="post">
    	学号<input type="text" name="id">
    	
    	<input type="submit" value="提交">
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<input type="reset" value="取消">
    </form>
    	
  </body>
</html>
