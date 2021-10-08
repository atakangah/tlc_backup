package labs;

public class Lab1 {

	int[] myArray = new int[3];
	
	public Lab1 () throws TestException {
		for (int i = 0; i < myArray.length; i++) myArray[i] = i+1;
	}
	
	public int[] getMyArray() {
		return this.myArray;
	}
}
