package main.java.abstracttypes;

import java.util.List;
import java.util.stream.Collectors;

public class Register {	
	private final List<Nameable> registeredStudents;
	
	public Register(List<Nameable> students) {
		this.registeredStudents = students;
	}
	
	public List<Nameable> getRegister() {
		return this.registeredStudents.stream().collect(Collectors.toList());
	}
}
