package main.java.generics;

import java.util.ArrayList;
import java.util.List;
import main.java.basics.Lecture;

public class BagOfLectures {
	private List<Lecture> bag = new ArrayList<Lecture>();

	public void add(Lecture aLecture) {
		if (aLecture != null) this.bag.add(aLecture);
	}
	
	public void remove(Lecture aLecture) {
		if (aLecture != null) this.bag.remove(aLecture);
	}
	
	public void clear() {
		this.bag.removeAll(bag);
	}
}
