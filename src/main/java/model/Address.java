package model;

public class Address {
	private int idAddress;
	private String region;
	private String city;
	public Address(int idAddress, String region, String city) {
		super();
		this.idAddress = idAddress;
		this.region = region;
		this.city = city;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public int getIdAddres() {
		return idAddress;
	}
	public void setIdAddres(int idAddress) {
		this.idAddress = idAddress;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
