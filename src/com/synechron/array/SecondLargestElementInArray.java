package com.synechron.array;

import java.util.logging.Logger;

public class SecondLargestElementInArray {

	private static Logger logger = Logger.getAnonymousLogger();

	public int findSecondLargerstElement(int arr[]) {

		int firstLargeElement;
		int secondLargestElement;
		if (arr[0] > arr[1]) {
			firstLargeElement = arr[0];
			secondLargestElement = arr[1];
		} else {
			firstLargeElement = arr[1];
			secondLargestElement = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {

			if (arr[i] > firstLargeElement) {
				secondLargestElement = firstLargeElement;
				firstLargeElement = arr[i];
			}

			if (arr[i] > secondLargestElement && arr[i] < firstLargeElement) {
				secondLargestElement = arr[i];
			}

		}

		return secondLargestElement;
	}

	public static void main(String[] args) {

		SecondLargestElementInArray secondLargestElementInArray = new SecondLargestElementInArray();

		int arr[] = { 2, 5, 3, 1, 67, 56 };

		logger.info("Second Largerst Element is:" + secondLargestElementInArray.findSecondLargerstElement(arr));

	}

}
