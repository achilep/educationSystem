package mapping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.GeneralServicewithId;
import Services.WelcomeService;
import model.Address;
import model.Course;
import model.EducationSystemFact;
import model.Gender;
import model.Lecture;
import model.Student;
import model.semester;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/Pivot.ca")
public class Pivot extends HttpServlet{
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
		request.getRequestDispatcher("/WEB-INF/views/Pivot.jsp").forward(request, response);
		
	}

}
