package main.java.start;

import main.java.abstracttypes.Register;

import java.util.List;
import java.util.ArrayList;

import main.java.abstracttypes.Nameable;
import main.java.basics.Student;
import main.java.enums.Level;

public class Main {
	public static void main(String[] args) {
		List<Nameable> students = new ArrayList<Nameable>();
		students.add(new Student("John Doe", Level.FRESHER));
		students.add(new Student("Jane Doe", Level.FRESHER));
		students.add(new Student("Mark Doe", Level.SENIOR));
		students.add(new Student("David Doe", Level.SOPHOMORE));
		students.add(new Student("Fred Doe", Level.JUNIOR));
		
		Register studentRegister = new Register(students);
		System.out.println(studentRegister.printReport());
	}
}
