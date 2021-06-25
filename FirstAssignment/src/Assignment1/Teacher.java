package Assignment1;

class Teacher extends Person{

	private  int numCourses;
	private String[] courses;
	
	public Teacher(String name, String address) {
		super(name, address);
	}

	public String getName() {
		return super.name;
	}
	
	public String getAddress() {
		return super.address;
	}
	
	public String toString(String name, String address) {
		System.out.println("***************************");
		System.out.println("======= TEACHER ==========");
		return "Name :  " + " " + super.name +" Address " + super.address;
	}
	
	boolean addCourse(String course) {
		for(int i=0; i<this.numCourses; i++) {
			if (this.courses[i] == course) {
				return false;
			}
		}
		return false;
	}
	
	boolean removeCourse(String course) {
		for (int i = 0; i<numCourses;i++) {
			if (this.courses[i] == course) {
				return false;
			}
		}
		return false;
	}
	
}
