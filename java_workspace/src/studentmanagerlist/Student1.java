package studentmanagerlist;

import java.util.Scanner;

import studentmanager.Subject;

public class Student1 {

	private String stdNum;
	private String stdName;
	private String faculty;
	private String major;
	
	
	// 생성자
	public Student1() {}

	public Student1(String stdNum, String stdName, String faculty, String major) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.faculty = faculty;
		this.major = major;
	}


	public String getStdNum() {
		return stdNum;
	}


	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "학번 : " + stdNum + ", 이름 : " + stdName + ", 학부 : " + faculty + ", 학과 : " + major;
	}
		
	
	
}
