package array.multi_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

// 3D Array
public class Traversing {

	// Reading a 3-D array from a user
	public static int[][][] readArray(int ai, int ri, int ci) {
		int[][][] temp = new int[ai][ri][ci];

		for (int i = 0; i < ai; i++) {
			for (int j = 0; j < ri; j++) {
				for (int k = 0; k < ci; k++) {
					System.out.print("arr[" + i + "]" + "[" + j + "]" + "[" + k + "]" + " = ");
					temp[i][j][k] = UserIO.readInt();
				}
			}
		}

		return temp;
	}

	// Traversing a 3-d Array
	public static void printArray(int[][][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("arr[" + i + "]" + "[" + j + "]" + "[" + k + "]" + " = " + arr[i][j][k]);
				}
			}
		}
	}

	// Printing a 3-D array in tabular form
	public static void printArrayTabular(int[][][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	// Main method or Driver code
	public static void main(String[] args) {
		try {
			int array_index = 2;
			int row_index = 2;
			int column_index = 3;

			// int[array_index = page_number = array_number][row_index][column_index]
			int[][][] arr = readArray(array_index, row_index, column_index);
			
			System.out.println("\nThe elements of a 3-D array are : ");
			printArray(arr);
			
			System.out.println("\n3-D Array in a tabular format : ");
			printArrayTabular(arr);
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
