package array.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

public class InsertionAtLast {
	// Reading an array elements from a user
	public static void readArray(int []arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("Enter any number : ");
			arr[i] = UserIO.readInt();
		}
	}

	// Printing an array
	public static void printArray(int []arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Function to insert an element at end/last index of an array
	public static void insert(int []arr, int size, int num) {
		arr[size] = num;
		size++;
	}

	// Printing an array after inserting an element at last/end
	public static void finalArray(int []arr, int size) {
		for (int i = 0; i <= size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Main Method
	public static void main(String[] args) {
		int MAX, size, num;
		try {
			System.out.print("Enter the size of an array : ");
			MAX = UserIO.readInt();

			System.out.print("\nHow many elements do you want to store? ");
			size = UserIO.readInt();

			int []arr = new int[MAX];

			readArray(arr, size);

			System.out.println("\nOriginal Array : ");
			printArray(arr, size);

			// Insertion operation
			System.out.print("\nEnter the number you want to insert : ");
			num = UserIO.readInt();

			insert(arr, size, num);

			System.out.println("\nArray after inserting an element at the end/last index : ");
			finalArray(arr, size);
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