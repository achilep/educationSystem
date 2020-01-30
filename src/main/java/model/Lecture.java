package model;

public class Lecture {
	
    private int idLecture;
	private String lecture ;
	private String name;
	private String phone;
	
	public Lecture(String lecture, String name, String phone) {
		super();
		this.lecture = lecture;
		this.name = name;
		this.phone = phone;
	}
	public Lecture(int idLecture, String lecture, String name, String phone) {
		super();
		this.idLecture = idLecture;
		this.lecture = lecture;
		this.name = name;
		this.phone = phone;
	}
	public int getIdLecture() {
		return idLecture;
	}
	public void setIdLecture(int idLecture) {
		this.idLecture = idLecture;
	}
	public String getLecture() {
		return lecture;
	}
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
