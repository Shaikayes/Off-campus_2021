package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentService {
	
	Map<Integer, Student> studentRecord;
	
	public StudentService() {
		super();
		studentRecord = new HashMap<>();
		init();
	}
	
	public void init() {
		
		studentRecord.put(1, new Student(101, "Ayesha", 555));
		studentRecord.put(2, new Student(102, "Ammu", 786));
		studentRecord.put(3, new Student(103, "Ahmed", 894));
		studentRecord.put(4, new Student(104, "Baba", 678));
	}
	
	public Student getStudent(int rollNumber) {
		return this.studentRecord.get(rollNumber);
	}

}
