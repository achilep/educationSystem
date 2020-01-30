package model;

public class Student {
	private String name;
	private String matricule;
	private int idStudent;
	private String phone;
	private String yearofenroll;
	public Student(String name, String matricule, int idStudent, String phone, String yearofenroll) {
		super();
		this.name = name;
		this.matricule = matricule;
		this.idStudent = idStudent;
		this.phone = phone;
		this.yearofenroll = yearofenroll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getYearofenroll() {
		return yearofenroll;
	}
	public void setYearofenroll(String yearofenroll) {
		this.yearofenroll = yearofenroll;
	}
	

}
