package com.koukio.priority.queue;

public class Student {
	private int id;
	private String name;
	private double CGPA;
	
	public Student(int id, String name, double cGPA) {
		super();
		this.id = id;
		this.name = name;
		this.CGPA = cGPA;
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
	public double getCGPA() {
		return CGPA;
	}
	public void setCGPA(double cGPA) {
		this.CGPA = cGPA;
	}
	@Override
	public String toString() {
		return name + " " + CGPA + " " + id ;
	}
	
}
