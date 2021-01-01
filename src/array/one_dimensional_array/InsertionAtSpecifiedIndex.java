package array.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

public class InsertionAtSpecifiedIndex {

	// Reading an array from user
	public static void readArray(int []arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("Enter any number : ");
			arr[i] = UserIO.readInt();
		}
	}

	public static void printArray(int []arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Function to insert an element at specified position
	public static void insert(int []arr, int pos, int num, int size) {
		if ((arr == null) || (pos < 0) || (pos > size + 1)) {
			System.out.println("Invalid position!");
		}
		else {
			for (int i = size - 1; i >= pos - 1; i--) {
				arr[i + 1] = arr[i];
			}
			arr[pos - 1] = num;
			size++;
		}
	}

	public static void printFinalArray(int []arr, int size) {
		for (int i = 0; i <= size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Driver code/method
	public static void main(String[] args) {
		int MAX, size, num, pos;
		try {
			System.out.print("Enter the size of an array : ");
			MAX = UserIO.readInt();

			System.out.print("\nHow many elements do you want to store? ");
			size = UserIO.readInt();

			// Declaring and initializing an array
			int []arr = new int[MAX];

			// Reading an array from user
			readArray(arr, size);

			// Printing an original array
			System.out.println("\nOriginal Array : ");
			printArray(arr, size);

			// Inserting an element at specified position or index
			System.out.print("\nEnter the number you want to insert: ");
			num = UserIO.readInt();

			System.out.print("\nEnter the position of element you want to insert: ");
			pos = UserIO.readInt();

			insert(arr, pos, num, size);

			// Printing an array after inserting an element at specified position
			System.out.println("\nArray after inserting an element : ");
			printFinalArray(arr, size);
		}
		catch(Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}

// Complexity = O(n)