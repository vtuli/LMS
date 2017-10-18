package com.sopra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column(name = "studentId", unique = true, nullable = true)
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;

	private String studentName;
	private double studentContactNumber;
	private String studentPassword;
	private boolean locked;
	private int numBooksIssued;
	private double studentPenalty;

	//Constructor to initialize Status, no. of books issued and penalty
	public Student() {
		this.locked = false;
		this.numBooksIssued = 0;
		this.studentPenalty = 0;
	}

	//Getter Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentContactNumber() {
		return studentContactNumber;
	}

	public void setStudentContactNumber(double studentContactNumber) {
		this.studentContactNumber = studentContactNumber;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

}
