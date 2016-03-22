package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private long studentId;
	private String studentName;
	private String department;
	private double academicScore;
	private double sportsScore;
	private double culturalScore;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getAcademicScore() {
		return academicScore;
	}
	public void setAcademicScore(double academicScore) {
		this.academicScore = academicScore;
	}
	public double getSportsScore() {
		return sportsScore;
	}
	public void setSportsScore(double sportsScore) {
		this.sportsScore = sportsScore;
	}
	public double getCulturalScore() {
		return culturalScore;
	}
	public void setCulturalScore(double culturalScore) {
		this.culturalScore = culturalScore;
	}
	public Student(long studentId, String studentName, String department, double academicScore, double sportsScore,
			double culturalScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.academicScore = academicScore;
		this.sportsScore = sportsScore;
		this.culturalScore = culturalScore;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", department=" + department
				+ ", academicScore=" + academicScore + ", sportsScore=" + sportsScore + ", culturalScore="
				+ culturalScore + "]";
	}
	

	
	
}
