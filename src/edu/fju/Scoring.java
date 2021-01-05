package edu.fju;

public class Scoring {

	public static void main(String[] args) {
		Student stu1 = new Student("Jack", 80, 60);
		int avg = stu1.average();
		if (avg <= 60) {
			System.out.println("I am sorry");
		} else {
			System.out.println("Congradulation");
		}
		System.out.println(stu1);
		
	}

}
