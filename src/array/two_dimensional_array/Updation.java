package array.two_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

public class Updation {
	// Reading an array from a user
	public static int[][] readArray(int m, int n) {
		int [][]temp = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter the element at rows, " + i + " and at cols, " + j + " : ");
				temp[i][j] = UserIO.readInt();
			}
		}

		return temp;
	}

	// Traversing an array
	public void printArray(int [][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Updating an array
	public void updateArray(int arr[][], int ele, int row, int col) {
		arr[row][col] = ele;
	}

	public static void main(String[] args) {
		int m, n, ele, row, col;
		try {
			System.out.print("Enter the number of rows : ");
			m = UserIO.readInt();

			System.out.print("Enter the number of cols : ");
			n = UserIO.readInt();

			int arr[][] = readArray(m, n);

			// Traversing an array - Printing an array
			System.out.println("\nOriginal Array : ");

			Updation update = new Updation();
			update.printArray(arr);

			System.out.println("\nEnter Updation Details : ");
			System.out.print("Enter the number to be insert : ");
			ele = UserIO.readInt();
			System.out.print("Enter the row no : ");
			row = UserIO.readInt();
			System.out.print("Enter the col no : ");
			col = UserIO.readInt();

			update.updateArray(arr, ele, row, col);
			System.out.println("\nArray after updating element : ");
			update.printArray(arr);
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
