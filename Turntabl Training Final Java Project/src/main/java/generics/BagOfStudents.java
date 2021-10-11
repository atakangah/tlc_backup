package main.java.generics;

import java.util.List;
import java.util.ArrayList;
import main.java.basics.Student;

public class BagOfStudents {
	
	private List<Student> bag = new ArrayList<Student>();

	public void add(Student aStudent) {
		if (aStudent != null) this.bag.add(aStudent);
	}
	
	public void remove(Student aStudent) {
		if (aStudent != null) this.bag.remove(aStudent);
	}
	
	public void clear() {
		this.bag.removeAll(bag);
	}
}
