package com.qc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int roll;
	private String name;
	private int age;
	private String address;
	private String gender;
	private String mobile;

	public Student() {
	}

	public Student(int roll, String name, int age, String address, String gender, String mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.mobile = mobile;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
