package model;

public class EducationSystemFact {
	
	 private int idEducationSYstemFact;
	 private int count;
	 private int avg;
	 private int  idAddess;
	 private int idCourse;
	 private int idGender;
	 private int idSemester;
	 private int idLecture;
	 private int idStudent;
	 
	public EducationSystemFact(int idEducationSYstemFact, int count, int avg, int idAddess, int idCourse, int idGender,
			int idSemester, int idLecture, int idStudent) {
		super();
		this.idEducationSYstemFact = idEducationSYstemFact;
		this.count = count;
		this.avg = avg;
		this.idAddess = idAddess;
		this.idCourse = idCourse;
		this.idGender = idGender;
		this.idSemester = idSemester;
		this.idLecture = idLecture;
		this.idStudent = idStudent;
	}
	public int getIdEducationSYstemFact() {
		return idEducationSYstemFact;
	}
	public void setIdEducationSYstemFact(int idEducationSYstemFact) {
		this.idEducationSYstemFact = idEducationSYstemFact;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getIdAddess() {
		return idAddess;
	}
	public void setIdAddess(int idAddess) {
		this.idAddess = idAddess;
	}
	public int getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	public int getIdGender() {
		return idGender;
	}
	public void setIdGender(int idGender) {
		this.idGender = idGender;
	}
	public int getIdSemester() {
		return idSemester;
	}
	public void setIdSemester(int idSemester) {
		this.idSemester = idSemester;
	}
	public int getIdLecture() {
		return idLecture;
	}
	public void setIdLecture(int idLecture) {
		this.idLecture = idLecture;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	 
	
}
