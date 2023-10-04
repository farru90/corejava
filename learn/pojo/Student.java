package com.learn.pojo;

public class Student {

	private int id;
	private String name;
	private String address;
	private String mobile;
	private int age;
	
	
	public Student() {
		super();
		
	}

	public Student(int id, String name, String address, String mobile, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", age=" + age
				+ "]";
	}
	
	
}
