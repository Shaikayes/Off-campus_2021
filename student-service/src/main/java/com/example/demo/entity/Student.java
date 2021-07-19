package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Student {
  
	@Autowired
	private int rollNumber;
	private String studentName;
	private int marks;
	
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", marks=" + marks + "]";
	}


	public Student(int rollNumber, String studentName, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
}
