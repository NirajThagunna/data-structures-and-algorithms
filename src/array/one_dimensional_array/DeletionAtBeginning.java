package array.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.ArrayIO;
import basicIO.UserIO;

// Program to delete an element at beginning
public class DeletionAtBeginning {

	// Function to delete an element from beginning of an array
	public static int delete(int []arr, int size, int pos) {
		int numDelete = arr[pos];

		for (int i = pos; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
		return numDelete;
	}

	public static void finalArray(int []arr, int size) {
		for (int i = 0; i < size - 1; i++) {
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
			int num = delete(arr, size, 0);
			System.out.println("\nThe deleted number is : " + num);

			System.out.println("\nArray after deleting an element at beginning : ");
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