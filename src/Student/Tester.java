package Student;

public class Tester {

	public static void main(String[] args) {
		
		Student[] studentArray = {new Student("Tom", 123456789L), new Student() ,new Student("Jerry", 987654321L)};
		
		for(Student s: studentArray) {
			System.out.println(s);
		}
		System.out.println("Program Terminated");

	}

}
