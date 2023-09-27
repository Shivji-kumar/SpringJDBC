package com.spring.jdbc.entites;

public class Student {
	private int id;
	private String name;
	private String city;
	private String course;
	
	public Student() {
		
	}
	public Student(int id, String name, String city, String course) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.course = course;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", course=" + course + "]";
	}
	
	

}
