package array.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.ArrayIO;
import basicIO.UserIO;

// Program to delete an element at last
public class DeletionFromLastIndex {

	// Deletion function
	public static int[] delete(int []arr, int size) {
		int []tempArray = new int[size - 1];

		for (int i = 0; i < size - 1; i++) {
			tempArray[i] = arr[i];
		}
		size--;
		return tempArray;
	}

	public static void finalArray(int []arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int size;
		try {
			System.out.print("How many elements do you want to store? ");
			size = UserIO.readInt();

			int []arr = ArrayIO.readArray(size);

			System.out.println("\nOriginal Array : ");
			ArrayIO.printArray(arr);

			// Deletion operation
			int newArray[] = delete(arr, size);
			System.out.println("\nThe deleted number is : " + arr[size - 1]);

			System.out.println("\nArray after deleting an element at last : ");
			finalArray(newArray);
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

// Complexity = O(1)