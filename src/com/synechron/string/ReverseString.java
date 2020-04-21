package com.synechron.string;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseString {

	private static Logger logger = Logger.getAnonymousLogger();

	public String reverseFisrtWay(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;

	}

	public StringBuffer reverseSecondWay(String str) {

		StringBuffer reverse = new StringBuffer(str);

		return reverse.reverse();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		logger.info("Please enter string:");
		String str = sc.next();
		ReverseString reverseString = new ReverseString();
		logger.info("Reversed String by using firstway is:" + reverseString.reverseFisrtWay(str));
		logger.info("Reversed String by using second way is:" + reverseString.reverseSecondWay(str));

	}
}
