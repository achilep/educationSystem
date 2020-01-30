package model;

public class Course {
	private int idCourse;
	private String coursename;
	private String pre;
	public Course(int idCourse, String coursename, String pre) {
		super();
		this.idCourse = idCourse;
		this.coursename = coursename;
		this.pre = pre;
	}
	public int getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getPre() {
		return pre;
	}
	public void setPre(String pre) {
		this.pre = pre;
	}
	

}
