package Services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Address;
import model.Course;
import model.EducationSystemFact;
import model.Gender;
import model.Lecture;
import model.Student;
import model.semester;

public class GeneralServicewithId {
	
	private connetiondb con=new connetiondb();
	private  ResultSet rs;
	private Address resAddress ;
	private Student resStudent ;
	private semester resSemester ;
	private Gender resGender ;
	private Course resCourse ;
	private Lecture resLecture ;
	private EducationSystemFact resEducation ;
	
	
	public GeneralServicewithId() {
		
	}
	public Address getAllAddress(int id){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Address where idAddress="+id+";";
			 rs = statement.executeQuery(sql);
					
			 
			 
				 while (rs.next()) {
					 

					 resAddress = new Address(rs.getInt("idAddress"),rs.getString("region"),rs.getString("city"));
					    
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resAddress;
	}
	public Course getAllCourse(int id){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Course where idCourse="+id+";";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					 resCourse= new Course(rs.getInt("idCourse"),rs.getString("cousename"),rs.getString("pre"));
					    
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resCourse;
	}
	
	public Lecture getAllLecture(int id){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Lecture where idLecture="+id+";";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					 resLecture = new Lecture(rs.getInt("idLecture"),rs.getString("lecture"),rs.getString("name"),rs.getString("phone"));
					    
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resLecture;
	}
	
	
	
	
	public semester getAllsemester(int id){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from semester where idsemester="+id+";";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					 resSemester = new semester(rs.getString("semester"),rs.getInt("idsemester"),rs.getDate("year"));
					    
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resSemester;
	}	
	
	
	
	public Student getAllStudent(int id){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Student where idAddress="+id+";";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					 resStudent   = new Student(rs.getString("name"),rs.getString("matricule"),rs.getInt("idStudent"),rs.getString("phone"),rs.getString("yearofenroll"));
					    
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resStudent;
	}
	
	public EducationSystemFact getAllEducationSystemFact(int id){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from EducationSystemFact where idEducationSYstemFact="+id+";";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					 resEducation   = new EducationSystemFact(rs.getInt("idEducationSYstemFact"),rs.getInt("count"),rs.getInt("avg"),rs.getInt("idAddress"),rs.getInt("idCourse"),rs.getInt("idGender"),rs.getInt("idSemester"),rs.getInt("idLecture"),rs.getInt("idStudent"));
					    
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resEducation;
	}	
	
public Gender getAllGender(int id){
		
		
		try{
			
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select * from Gender where idGender="+id+";";
			 rs = statement.executeQuery(sql);
					
			 
					
				 while (rs.next()) {
					 

					 resGender = new Gender(rs.getInt("idGender"),rs.getString("gender"));
					    
					    System.out.println("ok");
					}
					
					//con.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
		return resGender;
	}

}
