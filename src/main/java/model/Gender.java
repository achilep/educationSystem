package model;

public class Gender {
	private int idGender;
	private String Gender;
	public Gender(int idGender, String gender) {
		super();
		this.idGender = idGender;
		Gender = gender;
	}
	public int getIdGender() {
		return idGender;
	}
	public void setIdGender(int idGender) {
		this.idGender = idGender;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	

}
