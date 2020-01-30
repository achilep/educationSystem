package Services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Address;
import model.Course;
import model.EducationSystemFact;
import model.Gender;
import model.Lecture;
import model.Student;
import model.semester;

public class WelcomeService {
	private connetiondb con=new connetiondb();
	private  ResultSet rs;
	private List<Address> resAddress = new ArrayList();
	private List<Student> resStudent = new ArrayList();
	private List<semester> resSemester = new ArrayList();
	private List<Gender> resGender = new ArrayList();
	private List<Course> resCourse = new ArrayList();
	private List<Lecture> resLecture = new ArrayList();
	private List<EducationSystemFact> resEducation = new ArrayList();
	
	
	public WelcomeService() {
		
	}
	public List<Address> getAllAddress(){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Address;";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					Address  address = new Address(rs.getInt("idAddress"),rs.getString("region"),rs.getString("city"));
					    resAddress.add(address);
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resAddress;
	}
	public List<Course> getAllCourse(){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Course;";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					Course  Course = new Course(rs.getInt("idCourse"),rs.getString("cousename"),rs.getString("pre"));
					    resCourse.add(Course);
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resCourse;
	}
	
	public List<Lecture> getAllLecture(){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Lecture;";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					Lecture  lecture = new Lecture(rs.getInt("idLecture"),rs.getString("lecture"),rs.getString("name"),rs.getString("phone"));
					    resLecture.add(lecture);
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resLecture;
	}
	
	
	
	
	public List<semester> getAllsemester(){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from semester;";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					semester  semester = new semester(rs.getString("semester"),rs.getInt("idsemester"),rs.getDate("year"));
					    resSemester.add(semester);
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resSemester;
	}	
	
	
	
	public List<Student> getAllStudent(){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Student;";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					Student student   = new Student(rs.getString("name"),rs.getString("matricule"),rs.getInt("idStudent"),rs.getString("phone"),rs.getString("yearofenroll"));
					    resStudent.add(student);
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resStudent;
	}
	
	public List<EducationSystemFact> getAllEducationSystemFact(){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from EducationSystemFact;";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					EducationSystemFact educationSF   = new EducationSystemFact(rs.getInt("idEducationSYstemFact"),rs.getInt("count"),rs.getInt("avg"),rs.getInt("idAddress"),rs.getInt("idCourse"),rs.getInt("idGender"),rs.getInt("idSemester"),rs.getInt("idLecture"),rs.getInt("idStudent"));
					    resEducation.add(educationSF);
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resEducation;
	}	
	
public List<Gender> getAllGender(){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Gender;";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					Gender gender   = new Gender(rs.getInt("idGender"),rs.getString("gender"));
					    resGender.add(gender);
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resGender;
	}
public List<EducationSystemFact> rollUp(String date){
	try{
		
		Statement statement=con.obtenirconnexion().createStatement();
		String sql ="select idEducationSYstemFact,SUM(count),count*(avg),idAddess,idCourse,idGender,idSemester, idLecture from EducationSYstemFact,Student "
				+ "     where EducationSYstemFact.idStudent = Student.idStudent and Student.yearOfEnroll="+date
				+ "     GROUP BY idAddess,idCourse,idGender,idSemester, idLecture;";
		 rs = statement.executeQuery(sql);
				
		 
				
			 while (rs.next()) {
				 

				EducationSystemFact educationSF   = new EducationSystemFact(rs.getInt("idEducationSYstemFact"),rs.getInt("count"),rs.getInt("avg"),rs.getInt("idAddress"),rs.getInt("idCourse"),rs.getInt("idGender"),rs.getInt("idSemester"),rs.getInt("idLecture"),rs.getInt("idStudent"));
				    resEducation.add(educationSF);
				    System.out.println("ok");
				}
				
				//con.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
	return resEducation;

	
	
}
//to add town on the city
public List<EducationSystemFact> rollDown(String town){
	try{
		
		Statement statement=con.obtenirconnexion().createStatement();
		String sql ="select idEducationSYstemFact,SUM(count),count*(avg),idAddess,idCourse,idGender,idSemester, idLecture from EducationSYstemFact,Student "
				+ "     where EducationSYstemFact.idAddress = Address.idAddress and Address.town="+town
				+ "     GROUP BY idAddess,idCourse,idGender,idSemester, idLecture;";
		 rs = statement.executeQuery(sql);
				
		 
				
			 while (rs.next()) {
				 

				EducationSystemFact educationSF   = new EducationSystemFact(rs.getInt("idEducationSYstemFact"),rs.getInt("count"),rs.getInt("avg"),rs.getInt("idAddress"),rs.getInt("idCourse"),rs.getInt("idGender"),rs.getInt("idSemester"),rs.getInt("idLecture"),rs.getInt("idStudent"));
				    resEducation.add(educationSF);
				    System.out.println("ok");
				}
				
				//con.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
	return resEducation;

	
	
}

public List<EducationSystemFact> silice(String nameoflecture){
	try{
		
		Statement statement=con.obtenirconnexion().createStatement();
		String sql ="select idEducationSYstemFact,SUM(count),count*(avg),idAddess,idCourse,idGender,idSemester, idLecture from EducationSYstemFact,Student "
				+ "     where EducationSYstemFact.idLecture = Lecture.idLecture and idLecture.name="+nameoflecture
				+ "     GROUP BY idAddess,idCourse,idGender,idSemester, idStudent;";
		 rs = statement.executeQuery(sql);
				
		 
				
			 while (rs.next()) {
				 

				EducationSystemFact educationSF   = new EducationSystemFact(rs.getInt("idEducationSYstemFact"),rs.getInt("count"),rs.getInt("avg"),rs.getInt("idAddress"),rs.getInt("idCourse"),rs.getInt("idGender"),rs.getInt("idSemester"),rs.getInt("idLecture"),rs.getInt("idStudent"));
				    resEducation.add(educationSF);
				    System.out.println("ok");
				}
				
				//con.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
	return resEducation;

	
	
}
public List<EducationSystemFact> dice(String pname,String sname){
	try{
		
		Statement statement=con.obtenirconnexion().createStatement();
		String sql ="select idEducationSYstemFact,SUM(count),count*(avg),idAddess,idCourse,idGender,idSemester, idLecture from EducationSYstemFact,Student "
				+ "     where (EducationSYstemFact.idLecture = Lecture.idLecture and idLecture.name="+pname+"),("
						+ "(EducationSYstemFact.idLecture = Lecture.idLecture and idLecture.name="+sname+")"
				+ "     GROUP BY idAddess,idCourse,idGender,idSemester, idStudent;"; 
		
		rs = statement.executeQuery(sql);
						
			 while (rs.next()) {
				 

				EducationSystemFact educationSF   = new EducationSystemFact(rs.getInt("idEducationSYstemFact"),rs.getInt("count"),rs.getInt("avg"),rs.getInt("idAddress"),rs.getInt("idCourse"),rs.getInt("idGender"),rs.getInt("idSemester"),rs.getInt("idLecture"),rs.getInt("idStudent"));
				    resEducation.add(educationSF);
				    System.out.println("ok");
				}
				
				//con.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
	return resEducation;

	
	
}

//just to change the position on the ui
public List<EducationSystemFact> pivot(Date date){
	try{
		
		Statement statement=con.obtenirconnexion().createStatement();
		String sql ="select idEducationSYstemFact,SUM(count),count*(avg),idAddess,idCourse,idGender,idSemester, idLecture from EducationSYstemFact,Student "
				+ "     where EducationSYstemFact.idStudent = Student.idStudent and Student.yearOfEnroll="+date
				+ "     GROUP BY idAddess,idCourse,idGender,idSemester, idLecture;";
		 rs = statement.executeQuery(sql);
				
		 
				
			 while (rs.next()) {
				 

				EducationSystemFact educationSF   = new EducationSystemFact(rs.getInt("idEducationSYstemFact"),rs.getInt("count"),rs.getInt("avg"),rs.getInt("idAddress"),rs.getInt("idCourse"),rs.getInt("idGender"),rs.getInt("idSemester"),rs.getInt("idLecture"),rs.getInt("idStudent"));
				    resEducation.add(educationSF);
				    System.out.println("ok");
				}
				
				//con.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
	return resEducation;

	
	
}
	
  
}
