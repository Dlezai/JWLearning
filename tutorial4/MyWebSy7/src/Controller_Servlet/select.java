package Controller_Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.domain.Student;

public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public select() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student st=new Student();
		StudentDAO a=new StudentDAO();
  		st.setId(Integer.parseInt(request.getParameter("id")));
  		try {
  			st=a.find(st);		
			if(st!=null){
				request.setAttribute("st",st);
				request.getRequestDispatcher("find_id_show.jsp").forward(request, response);
			}
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

}
