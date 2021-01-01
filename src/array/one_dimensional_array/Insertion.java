package array.one_dimensional_array;

import basicIO.UserIO;

import java.io.PrintWriter;
import java.io.StringWriter;

// Program to insert an element at specified position, order doesn't matter
public class Insertion {
	public static void readArray(int []arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("Enter any element : ");
			arr[i] = UserIO.readInt();
		}
		System.out.println();
	}

	public static void printArray(int []arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void insert(int []arr, int size, int num, int pos) {
		if (pos <= 0 || pos > size + 1) {
			System.out.println("Invalid Position!");
		}
		else {
			arr[size] = arr[pos - 1];
			arr[pos - 1] = num;
			size++;
		}
	}

	public static void finalArray(int []arr, int size) {	
		for (int i = 0; i <= size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int MAX, size, pos, num;
		try {
			System.out.print("Enter the size of an array : ");
			MAX = UserIO.readInt();

			System.out.print("\nHow many elements do you want to store? ");
			size = UserIO.readInt();

			int []arr = new int[MAX];

			// Reading an array from user
			readArray(arr, size);

			// Original Array
			System.out.println("\nOriginal Array : ");
			printArray(arr, size);

			// Insertion Operation
			System.out.print("\nEnter the number you want to insert : ");
			num = UserIO.readInt();

			System.out.print("\nEnter the position of an element : ");
			pos = UserIO.readInt();

			insert(arr, size, num, pos);

			System.out.println("\nArray after inserting an element : ");
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