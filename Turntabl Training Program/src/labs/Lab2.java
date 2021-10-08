package labs;

import java.util.Arrays;

public class Lab2 {

	private final int[] myArray = { 20, 1, 15, 45, 5, 10};
	
	public void sortMyArray() {
		//Arrays.sort(this.myArray);
		this.doInsertionSort();
	}
	
	private void doInsertionSort() {		
		for (int key = 1; key < this.myArray.length; key++) {
			this.doSwap(key);
		}
	}
	
	private void doSwap(int currIndex) {
		int currValue = this.myArray[currIndex];
		
		for (int key = currIndex-1; key >= 0; key--) {
			if (currValue < this.myArray[key]) {
				this.doSwap(currIndex, key);
				currIndex = key;
			}
		}
	}
	
	private void doSwap(int src, int dest) {
		int temp = this.myArray[src];
		this.myArray[src] = this.myArray[dest];
		this.myArray[dest] = temp;
	}
	
	public void printMyArray() {
		for (int it : this.myArray) System.out.println(it);
	}
	
	public int getMyArraySize() {
		return this.myArray.length;
	}
	
	public int[] getMyArray() {
		return this.myArray;
	}
}
