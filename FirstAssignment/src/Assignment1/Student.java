package Assignment1;

import java.util.*;

class Student extends Person {
	ArrayList<String> courses = new ArrayList<String>();
	ArrayList<Integer> grades = new ArrayList<Integer>();

	public Student(String name, String address) {
		super(name, address);
	}

	public String getName() {
		return super.name;
	}

	public String getAddress() {
		return super.address;
	}

	String toString(String name, String address) {
		System.out.println("=======STUDENT INFORMATION=======");
		return "Name : " + super.name + " " + "Address : " + super.address;
	}

	public void addCourseGrade(String course, int grade) {
		this.courses.add(course);
		this.grades.add(grade);
	}

	void printGrades() {
		System.out.println(this.courses);
		System.out.println(this.grades);
	}

	double getAverageGrade() {
		int length = grades.size();
		double sum = 0;
		for (double grade : grades) {
			sum += grade;
		}
		return sum / length;
	}

}
