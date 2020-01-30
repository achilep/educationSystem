package mapping;

import javax.servlet.annotation.WebServlet;
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

@WebServlet(urlPatterns = "/Dice.ca")
public class Dice extends HttpServlet{
	private List<Address> resAddress = new ArrayList();
	private List<Student> resStudent = new ArrayList();
	private List<semester> resSemester = new ArrayList();
	private List<Gender> resGender = new ArrayList();
	private List<Course> resCourse = new ArrayList();
	private List<Lecture> resLecture = new ArrayList();
	private List<EducationSystemFact> resEducation = new ArrayList();
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
	 String pname = request.getParameter("pname");
	 String sname = request.getParameter("sname");
	 WelcomeService welcomeservice = new WelcomeService();
	 GeneralServicewithId generalservice=new GeneralServicewithId();
	 List <EducationSystemFact> educationList= welcomeservice.dice(pname, sname);
	 for(int i =0;i<educationList.size();i++) {
		 Address address=new Address();
	 
		 resAddress.add(generalservice.getAllAddress(educationList.get(i).getIdAddess()));
		 resCourse.add (generalservice.getAllCourse( educationList.get(i).getIdCourse()));
		 //resEducation= welcomeservice.getAllEducationSystemFact();
		resGender.add( generalservice.getAllGender( educationList.get(i).getIdGender()));
		resLecture.add( generalservice.getAllLecture( educationList.get(i).getIdLecture()));
		resSemester.add( generalservice.getAllsemester( educationList.get(i).getIdSemester()));
		resStudent.add( generalservice.getAllStudent( educationList.get(i).getIdStudent()));
		
	 }	
		request.setAttribute("Address", resAddress);
		request.setAttribute("Course", resCourse);
		request.setAttribute("EducationSF",educationList );
		request.setAttribute("Gender", resGender);
		request.setAttribute("lecture", resLecture);
		request.setAttribute("semester", resSemester);
		request.setAttribute("Student", resStudent);
		request.getRequestDispatcher("/WEB-INF/views/Dice.jsp").forward(request, response);
	 
	 
}

}
