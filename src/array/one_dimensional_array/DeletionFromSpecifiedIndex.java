package array.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.ArrayIO;
import basicIO.UserIO;

// Program to delete an element from the specified index of an array
public class DeletionFromSpecifiedIndex {

	// Function to delete an element from a specified position
	public static int delete(int []arr, int size, int pos) {
		int numDelete = 0;

		if ((arr == null) || (pos < 0) || (pos > size)) {
			System.out.println("Invalid Position!");
		}
		else {
			numDelete = arr[pos - 1];
			for (int i = pos - 1; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			size--;
		}
		return numDelete;
	}

	public static void finalArray(int []arr, int size) {
		for (int i = 0; i < size - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int MAX, pos;
		try {
			System.out.print("How many elements do you want to store? ");
			MAX = UserIO.readInt();

			int []arr = ArrayIO.readArray(MAX);

			System.out.println("\nOriginal Array : ");
			ArrayIO.printArray(arr);

			// Deletion operation
			System.out.print("\nEnter the position of an element to delete : ");
			pos = UserIO.readInt();

			int num = delete(arr, MAX, pos);
			System.out.println("\nThe deleted number is : " + num);

			System.out.println("\nArray after deletion of an element from a specified position : ");
			finalArray(arr, MAX);
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

// Complexity = O(n)