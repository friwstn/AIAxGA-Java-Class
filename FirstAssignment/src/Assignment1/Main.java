package Assignment1;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Wawan", "Sumbawa");
		System.out.println(student.getName() + student.getAddress());
		System.out.println(student.toString("Wawan", "Sumbawa"));
		
		student.addCourseGrade("MATH", 80);
		student.addCourseGrade("BIOLOGY", 90);
		student.addCourseGrade("CHEMIST", 89);
		student.printGrades();
		System.out.println(student.getAverageGrade());
		
		Teacher teacher = new Teacher(" Jojo", "Namek");
		System.out.println(teacher.toString("Jojo", "Namek"));
		teacher.addCourse("A");
		teacher.addCourse("B");
		teacher.addCourse("C");
		teacher.removeCourse("A");
		System.out.println(teacher.addCourse("A"));
		System.out.println(teacher.removeCourse("D"));
		
		
	}
}
