package main.java.enums;

public enum Level {
    FRESHER(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4);
	
	private int year;
	
	Level(int year) {
		this.year = year;
	}
}
