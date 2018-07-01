package Controller_Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.domain.Student;


public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
		/*
		if(n>=1)
			request.getRequestDispatcher("success.jsp").forward(request, response);
		else
			request.getRequestDispatcher("error.jsp").forward(request, response);
		*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
request.setCharacterEncoding("utf-8");
		
		
		
		Student st=new Student();
		//st.setId(Integer.parseInt(request.getParameter("id")));
		//int id=(int)request.getAttribute("id");
		//查询到的id，若要改变所查询到的学生的id，就要改变StudentDAO的参数，如：Student DAO（Student stu,int id）
		
		st.setId(Integer.parseInt(request.getParameter("id")));
        st.setName(request.getParameter("name2"));
        st.setSex(request.getParameter("sex2"));
        st.setAge(Integer.parseInt(request.getParameter("age")));
        st.setWeight(Float.parseFloat(request.getParameter("weight")));
        st.setHight(Float.parseFloat(request.getParameter("hight")));
		
		StudentDAO ud=new StudentDAO();
		try {
			ud.update(st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
