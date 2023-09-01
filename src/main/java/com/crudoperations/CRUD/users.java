package com.crudoperations.CRUD;

public class users {
	
	int id;
	String name;
	int age;
	public users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public users(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
