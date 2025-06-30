package classDemo;

public class Student {
	
	private int age;
	private int roll;
	
	public Student(){
		this(6);
		System.out.println("default constructor");
		
	}
	public Student(int roll){
		
		System.out.println("parameterized constructor");
	}
	
	
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}



	/**
	 * @param roll the roll to set
	 */
	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String toString() {
		return "Student data [ Roll : "+roll+ " Age : "+age;
		 
	}
	public void display(int a) {
		System.out.println(roll+ " "+age);
	}
	

}
