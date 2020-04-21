package com.synechron.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayRolation {

	private static Logger logger = Logger.getAnonymousLogger();

	public int[] rotateArrayBy(int arr[], int rotateBycount) {
		int rotatedArray[] = new int[arr.length];
		if (arr.length == rotateBycount) {
			return arr;
		} else {

			int countToBeRotated[] = new int[rotateBycount];
			int remaining[] = new int[arr.length - rotateBycount];
			int n = 0;

			for (int i = 0; i < arr.length; i++) {
				if (i < rotateBycount) {
					countToBeRotated[i] = arr[i];
				} else {
					remaining[n++] = arr[i];
				}
			}

			rotatedArray = Arrays.copyOf(remaining, remaining.length + rotateBycount);

			int j = 0;
			for (int i = remaining.length; i < remaining.length + rotateBycount; i++) {
				rotatedArray[i] = countToBeRotated[j++];
			}
			return rotatedArray;
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		logger.info("Please enter rotate by count");
		Scanner sc = new Scanner(System.in);
		int rotateCountBy = sc.nextInt();

		ArrayRolation arrayRolation = new ArrayRolation();
		int response[] = arrayRolation.rotateArrayBy(arr, rotateCountBy);

		for (int a : response) {
			logger.info(a + "");
		}

	}

}
