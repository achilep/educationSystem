package model;

import java.util.Date;

public class semester {
	private String Semester;
	private int idSemester;
	private Date year;
	public semester(String semester, int idSemester, Date year) {
		super();
		Semester = semester;
		this.idSemester = idSemester;
		this.year = year;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}
	public int getIdSemester() {
		return idSemester;
	}
	public void setIdSemester(int idSemester) {
		this.idSemester = idSemester;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	
	

}
