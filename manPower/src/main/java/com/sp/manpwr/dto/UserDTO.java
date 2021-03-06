package com.sp.manpwr.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {
	@NotNull
	@NotEmpty
	private String fName;
	@NotNull
	@NotEmpty
	private String lName;
	@NotNull
	@NotEmpty
	private String email;
	@NotNull
	@NotEmpty
	private String phNo;
	private String uName;
	private String password;
	private String address;
	private String adhaarid;
	private String DOB;
	private String Gender;
	private Boolean checkboxcondition;
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getCheckboxcondition() {
		return checkboxcondition;
	}

	public void setCheckboxcondition(Boolean checkboxcondition) {
		this.checkboxcondition = checkboxcondition;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	private String profession;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdhaarid() {
		return adhaarid;
	}

	public void setAdhaarid(String adhaarid) {
		this.adhaarid = adhaarid;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [fName=" + fName + ", lName=" + lName + ", email=" + email + ", phNo=" + phNo + ", uName="
				+ uName + ", password=" + password + ", address=" + address + ", adhaarid=" + adhaarid + ", DOB=" + DOB
				+ ", Gender=" + Gender + ", checkboxcondition=" + checkboxcondition + ", role=" + role + ", profession="
				+ profession + "]";
	}

}
