package javaHomeWork3;

public class Main {

	public static void main(String[] args) {
		
		//Student student = new Student();
		//student.setId(1);
		//student.setName("Mehmet Gelir");
		//student.setAge(26);
		//System.out.println(student.getName());
		
		Instructor inst = new Instructor();
		inst.setId(2);
		inst.setName("Engin Demiroğ");
		System.out.println(inst.getName());
		
		
		Student student = new Student();
		student.setId(1);
		student.setName("Mehmet Gelir");
		System.out.println(student.getName());
		
		UserManager userManagers = new UserManager();
		userManagers.add();
		
		UserManager[] userManager = new UserManager[] {new StudentManager(),new InstructorManager()};
		for (UserManager userManager2 : userManager) {
			userManager2.add();
		}

	}

}
