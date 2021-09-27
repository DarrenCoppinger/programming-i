package Student;

public class Student {
	//Variables
	private String name;
	private long IDnumber;
	
	//Constructors
	public Student(String name, long IDnumber){
		this.name = name;
		this.IDnumber = IDnumber;
	}
	
	public Student(){
		this(null, 0L);
	}
	
	//Methods (getters and setters)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIDnumber() {
		return IDnumber;
	}

	public void setIDnumber(long IDnumber) {
		this.IDnumber = IDnumber;
	}
	
	public String toString() {
		return "Name: " + getName() + ", ID Number: " + getIDnumber();
	}
	
	
	

}
