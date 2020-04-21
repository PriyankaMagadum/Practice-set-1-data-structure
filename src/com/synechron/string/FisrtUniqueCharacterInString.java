package com.synechron.string;

import java.util.Scanner;
import java.util.logging.Logger;

public class FisrtUniqueCharacterInString {

	private static Logger logger = Logger.getAnonymousLogger();

	public Character findFisrtUniqueCharacterWaySecond(String str) {
		char firstunique = 0;

		for (int i = 0; i < str.length(); i++) {

			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					count = count + 1;
					break;
				}
			}
			if (count == 0) {
				firstunique = str.charAt(i);
				break;
			}

		}

		return firstunique;
	}

	public char findFisrtUniqueCharacterWayFisrt(String str) {
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (i == str.lastIndexOf(charAt)) {
				return charAt;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		logger.info("Please enter string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		FisrtUniqueCharacterInString fisrtUniqueCharacterInString = new FisrtUniqueCharacterInString();
		char firstUnique = fisrtUniqueCharacterInString.findFisrtUniqueCharacterWayFisrt(str);
		// char firstUnique =
		// fisrtUniqueCharacterInString.findFisrtUniqueCharacterWaySecond(str);
		if (firstUnique == 0) {
			logger.info("No unique character in the string");
		} else {
			logger.info("Fisrt unique character in the string is:" + firstUnique);
		}
	}

}
