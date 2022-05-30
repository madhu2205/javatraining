package com.example.demoweb4;

import java.util.List;

public class Student {
	
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Gender;
	private List<String> Plang;
	private String Os;
	private String City;
	
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getOs() {
		return Os;
	}
	public void setOs(String os) {
		Os = os;
	}
	public List<String> getPlang() {
		return Plang;
	}
	public void setPlang(List<String> plang) {
		Plang = plang;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
}
