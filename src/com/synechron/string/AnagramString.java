package com.synechron.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class AnagramString {

	private static Logger logger = Logger.getAnonymousLogger();

	public boolean checkAnagramString(String firstString, String secondString) {

		if (firstString.length() != secondString.length()) {
			return false;
		} else {

			char fisrtStringArray[] = firstString.toCharArray();
			char secondStringArray[] = secondString.toCharArray();

			Arrays.sort(fisrtStringArray);
			Arrays.sort(secondStringArray);

			for (int i = 0; i < fisrtStringArray.length; i++) {

				if (fisrtStringArray[i] != secondStringArray[i])
					return false;

			}

		}
		return true;

	}

	public static void main(String[] args) {

		logger.info("Please enter first string:");
		Scanner sc = new Scanner(System.in);
		String firstString = sc.next();
		logger.info("Please enter second string:");
		String secondString = sc.next();
		AnagramString anagramString = new AnagramString();
		boolean status = anagramString.checkAnagramString(firstString, secondString);
		if (status) {
			logger.info("Strings are anagram");
		} else {
			logger.info("Strings are not anagram");
		}

	}
}
