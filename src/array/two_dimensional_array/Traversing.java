package array.two_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

// Program to traverse an array
public class Traversing {
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
	
	// Traversing an array - Accessing the elements of an array in a tabular form
	public void printArrayTabular(int [][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// Accessing an elements of an array in linear form
	public void printArrayLinear(int [][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int m, n;
		try {
			System.out.print("Enter the number of rows : ");
			m = UserIO.readInt();
			
			System.out.print("Enter the number of cols : ");
			n = UserIO.readInt();
			
			int arr[][] = readArray(m, n);
			
			// Traversing an array - Printing an array
			System.out.println("\nThe elements of an array in tabular form : ");
			
			Traversing traverse = new Traversing();
			traverse.printArrayTabular(arr);
			
			System.out.println("\nThe elements of an array in linear form : ");
			traverse.printArrayLinear(arr);
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
