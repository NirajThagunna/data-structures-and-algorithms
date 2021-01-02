package array.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.ArrayIO;
import basicIO.UserIO;

// Program to print an array in reverse order recursively
public class ArrayInReverseOrderRecursively {
	
	// Recursive Function
	public static void reverseArray(int []arr, int start, int end) {
		int temp;
		
		if (start >= end) {
			return;
		}
		else {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		reverseArray(arr, start + 1, end - 1);
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
			
			// Calling Recursive Function
			reverseArray(arr, 0, MAX - 1);
			
			// Reverse Array
			System.out.println("\nArray in Reverse Order : ");
			ArrayIO.printArray(arr);
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

// Time Complexity = O(n)