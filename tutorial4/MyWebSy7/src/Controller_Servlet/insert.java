package Controller_Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.domain.Student;
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		Student stu=new Student();
        stu.setId(Integer.parseInt(request.getParameter("id")));
        stu.setName(request.getParameter("name"));
        stu.setSex(request.getParameter("sex"));
        stu.setAge(Integer.parseInt(request.getParameter("age")));
        stu.setWeight(Float.parseFloat(request.getParameter("weight")));
        stu.setHight(Float.parseFloat(request.getParameter("hight")));
      
		
		
		StudentDAO add=new StudentDAO();
			try {
				if(add.create(stu)!=null)
					request.getRequestDispatcher("success.jsp").forward(request, response);
				else
					request.getRequestDispatcher("error.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	/*
	int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	String sex=request.getParameter("sex");
	int age=Integer.parseInt(request.getParameter("age"));
	float weight=Float.parseFloat(request.getParameter("weight"));
	float hight=Float.parseFloat(request.getParameter("hight"));
	
	
	
	String sql1="insert into stu_info(id,name,sex,age,weight,hight)";
	String sql2="values("+id+","+name+","+sex+","+age+","+weight+","+hight+")";
	String sql=sql1+sql2;
	DbUtil run=new DbUtil();
	int n=run.updateSQL(sql);
	if(n>=1)
		request.getRequestDispatcher("success.jsp").forward(request, response);
	else
		request.getRequestDispatcher("error.jsp").forward(request, response);
	*/

}
