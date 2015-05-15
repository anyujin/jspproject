package exam.dto;

import java.sql.*;

// VO(Value Object) = DTO(Date Transfer Object) = Java Beans
public class Member {
	private String id; 			//private - 같은 class안에서만 접근 
	private String pass;
	private String name;
	private int age;
	private String gender;
	private String addr;
	private Date regDate;
	
	public String getId() {		//메소드를 이용하여 접근 - 정보은닉 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
