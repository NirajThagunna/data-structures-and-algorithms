package array.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.ArrayIO;
import basicIO.UserIO;

// Program to print an array in reverse order
public class ArrayInReverseOrder {
	// Function to reverse an array
	public static int[] reverseArray(int []arr) {
		int n = arr.length;
		int tempArray[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			tempArray[n - i - 1] = arr[i];
		}
		return tempArray;
	}
	
	public static void main(String[] args) {
		int MAX;
		try {
			System.out.print("How many elements do you want to store? ");
			MAX = UserIO.readInt();
			
			int []arr = ArrayIO.readArray(MAX);
			
			// Original Array
			System.out.println("\nOriginal Array : ");
			ArrayIO.printArray(arr);
			
			// Reverse operation
			int reverseArray[] = reverseArray(arr);
			
			// Printing the final array
			System.out.println("\nArray in Reverse Order : ");
			ArrayIO.printArray(reverseArray);
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}

//Time Complexity = O(n)