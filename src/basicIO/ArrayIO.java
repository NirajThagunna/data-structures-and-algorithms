package basicIO;

public class ArrayIO {

	// Reading an array from a user
	public static int[] readArray(int n) {

		// Declaring and initializing an array
		int []arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter any number : ");
			arr[i] = UserIO.readInt();
		}
		return arr;
	}

	// Printing an array
	public static void printArray(int []arr) {
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
