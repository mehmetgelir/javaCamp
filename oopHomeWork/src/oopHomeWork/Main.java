package oopHomeWork;

public class Main {

	public static void main(String[] args) {


		Course course1 = new Course();
		course1.id=1;
		course1.name = "C#";
		course1.detail ="Nitelikli Yazýlýmcý Yetiþtirme Kampý";
		
		Course course2 = new Course(2,"Java","Nitelikli Java Kampý");
		
		
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		System.out.println(courses.length);
		
		
		
		Educator educator1 = new Educator();
		educator1.id=1;
		educator1.name="Engin Demirog";
		
		Educator educator2 = new Educator(2,"Kerem Varis");
		
		
		Educator[] educators = {educator1,educator2};
		
		for (Educator educator : educators) {
			System.out.println(educator.name);
		}
		System.out.println(educators.length);

		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1, educator1);
		courseManager.addCourse(course2, educator2);
	}
	
	
	

}
