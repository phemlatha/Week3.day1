package org.student;

import org.department.Department;

public class Student extends Department  {
		public static void studentName()
		{
			System.out.println("Student Name : ABC");
		}
		public static void studentDept()
		{
			System.out.println("Student Dept : Mech");
		}
		public static void studentId()
		{
			System.out.println("Student ID : 23456");
		}



public static void main(String[] args) {
	Student stuObj = new Student();
	
	stuObj.collegeName();
	stuObj.deptName();
	stuObj.studentId();
	stuObj.studentName();
	
	
	
}}




