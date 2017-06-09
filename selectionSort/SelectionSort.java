package selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 12, 67, -100, 87, 90, 300, 53 };

		System.out.println(minValue(myArray, 7));
	}

	public static int minValue(int[] array, int len) {
		int minValue = array[0];
		int minValuePos = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				minValuePos = i;
			}
		}
		// System.out.println("minValue " minValue);
		// System.out.println('minValuePos ' + minValuePos);
		return (minValuePos);
	}

	public static int[] selectionSort(int[] arr) {
		// create new array of same length as arr
		// loop
		// find smallest value in arr, append it to new array, remove from
		// original
		// shift indexes after removed index down by 1
		// keep track of the logical length (number of unremoved elements)
		// repeat until you've copied all values from arr to new array
		// return the new array
		int[] newArray= new int[arr.length];
		int len = arr.length;
		int minValuePos;
		
		for (int i=0; i < len; i++){
			minValuePos=minValue(myArray, len);
		    
			newArray[i]=minValue(myArray, len)
			
		}
		return newArray;
	}
}
