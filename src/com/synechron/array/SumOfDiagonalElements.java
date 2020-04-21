package com.synechron.array;

import java.util.logging.Logger;

public class SumOfDiagonalElements {

	private static Logger logger = Logger.getAnonymousLogger();

	public void sumOfDiagonalElements(int arr[][]) {

		int firstDiagonalSum = 0;
		int secondDiagonalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (i == j) {
					firstDiagonalSum = firstDiagonalSum + arr[i][j];
				}

				if ((i + j) == (arr.length - 1)) {
					secondDiagonalSum = secondDiagonalSum + arr[i][j];
				}

			}
		}

		logger.info("first diagonal sum=" + firstDiagonalSum);
		logger.info("second diagonal sum=" + secondDiagonalSum);

	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 4, 20 }, { 3, 10, 5 }, { 9, 8, 7 } };
		SumOfDiagonalElements sumOfDiagonalElements = new SumOfDiagonalElements();
		sumOfDiagonalElements.sumOfDiagonalElements(arr);
	}

}
