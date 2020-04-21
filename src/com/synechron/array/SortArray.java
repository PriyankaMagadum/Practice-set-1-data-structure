package com.synechron.array;

import java.util.logging.Logger;

public class SortArray {

	// selection sort
	public int[] sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		SortArray sortArray = new SortArray();
		int arr[] = { 0, 1, 2, 0, 1, 2 };
		System.out.print("Sorted array=");
		for (int a : sortArray.sort(arr)) {
			System.out.print(a + ",");
		}

	}

}
