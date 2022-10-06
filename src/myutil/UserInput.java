package myutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static String getString() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String inputString = br.readLine();
			return inputString;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
		return null;
	}

	public static String getString(String title) {
		System.out.println(title);
		return getString();
	}

	public static int getNumber() {
		try {
			int num = Integer.parseInt(getString());
			if (num < 0) {
				num = -1;
			}
			return num;
		} catch (Exception e) {
			return -1;
		}

	}

	public static int getNumber(String title) {
		System.out.println(title);
		return getNumber();

	}
}
