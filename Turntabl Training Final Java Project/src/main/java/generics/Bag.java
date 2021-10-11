package main.java.generics;

import java.util.List;
import java.util.ArrayList;

public class Bag<T> {
	private List<T> bag = new ArrayList<T>();

	public void add(T bagItem) {
		if (bagItem != null) this.bag.add(bagItem);
	}
	
	public void remove(T bagItem) {
		if (bagItem != null) this.bag.remove(bagItem);
	}
	
	public void clear() {
		this.bag.removeAll(this.bag);
	}
}
