package array.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

public class Traversing {
	// Read array from a user
	public static int[] readArray(int n) {
		// Declaring and initializing an array
		int []arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter any number : ");
			arr[i] = UserIO.readInt();
		}
		return arr;
	}

	// Print an array
	public static void printArray(int []arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Searching an elements using Linear Search Algorithm
	public static int linearSearch(int []arr, int n, int num) {
		int index = -1;

		// If the element is present in an array then return index value of that element
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				index = i;
				break;
			}
		}

		// else if the element is not present in an array then return -1
		return index;
	}

	// Main method
	public static void main(String[] args) {
		int size, num;
		try {
			System.out.print("How many elements do you want to store? ");
			size = UserIO.readInt();

			int []arr = readArray(size);

			System.out.println("\nElements in an array : ");
			printArray(arr, size);

			// To search an elements from an unsorted array, we use Linear Search Algorithm
			System.out.print("\nEnter the element you want to search: ");
			num = UserIO.readInt();

			int position = linearSearch(arr, size, num);

			if (position == -1) {
				System.out.printf("\nThe element %d is not present in an array.", num);
			}
			else {
				System.out.printf("\nThe element %d is present at position %d in an array.", num, (position + 1));
			}
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