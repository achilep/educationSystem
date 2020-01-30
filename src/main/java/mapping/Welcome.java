package mapping;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.WelcomeService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;


@WebServlet(urlPatterns = "/welcome.ca")
public class Welcome extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		WelcomeService welcomeservice = new WelcomeService();
		request.setAttribute("Address", welcomeservice.getAllAddress());
		request.setAttribute("Course", welcomeservice.getAllCourse());
		request.setAttribute("EducationSF", welcomeservice.getAllEducationSystemFact());
		request.setAttribute("Gender", welcomeservice.getAllGender());
		request.setAttribute("lecture", welcomeservice.getAllLecture());
		request.setAttribute("semester", welcomeservice.getAllsemester());
		request.setAttribute("Student", welcomeservice.getAllStudent());
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		
	}
	
	
	 /* public void doPut(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	    { //your code here
		  String category_name = request.getParameter("category_name");
		  String category_id = request.getParameter("category_id");
			
		   cat.update(category_id,category_name);
		 // request.setAttribute("category", cat.list_category());
		  request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	    }
	  public void doDelete(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	    { //your code here
		  
	    }*/
	

		

		/*@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			String name = request.getParameter("name");
			String password = request.getParameter("password");

			boolean isValidUser = service.validateUser(name, password);

			if (isValidUser) {
			request.setAttribute("name", name);
				request.setAttribute("todos", todoService.retrieveTodos());
				request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
			} else {
				request.setAttribute("errorMessage", "Invalid Credentials!!");
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			}
		}*/

	


}
