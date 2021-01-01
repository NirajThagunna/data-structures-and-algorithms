package basicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;

public class UserIO {
	public static String readInput() {
		String str = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			str = reader.readLine();
		}
		catch (IOException ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
		return str;
	}
	
	public static int readInt() {
		int num = 0;
		try {
			num = Integer.parseInt(readInput());
		}
		catch (NumberFormatException ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
		return num;
	}
}
