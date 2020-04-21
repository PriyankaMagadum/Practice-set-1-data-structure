package com.synechron.timecomlexityalgorithm;

public class TimeComplexityAlgorithm {

	public void O1TimeComplexity(int arr[]) {

		System.out.println("array at index 1 is=" + arr[1]);

	}

	public void ONTimeComplexity(int arr[]) {

		for (int element : arr) {
			System.out.println(element);
		}

	}

	public int[] ONNTimeComplexity(int arr[]) {

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

	public void printArray(int arr[]) {
		for (int element : arr) {
			System.out.println(element);
		}

	}

	public void ONNNTimeComplexity(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					System.out.println(arr[k]);
				}
			}
		}
	}

	public void OLogNTimeComplexity(int arr[]) {
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}

	public void ONLogNTimeComplexity(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i = i + 2) {
				System.out.println(arr[i]);
			}
		}
	}

	public void OMNTimeComplexity(int arr[]) {

		// here m=arr.length and n=5

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(arr[j]);
			}
		}

	}

	public static void main(String[] args) {
		TimeComplexityAlgorithm algorithm = new TimeComplexityAlgorithm();
		int arr[] = { 2, 10, 23, 52, 14, 36, 9 };

		System.out.println("=============O(1) Time Complexity============================");
		// O(1) time complexity algorithm
		algorithm.O1TimeComplexity(arr);

		System.out.println("=============O(N) Time Complexity============================");
		// O(n) time complexity algorithm
		algorithm.ONTimeComplexity(arr);

		System.out.println("=============O(N^2) Time Complexity============================");
		// O(n^2) time complexity algorithm
		algorithm.ONNTimeComplexity(arr);
		algorithm.printArray(arr);

		System.out.println("=============O(N^3) Time Complexity============================");
		// O(n^3) time complexity algorithm
		algorithm.ONNNTimeComplexity(arr);

		System.out.println("=============O(logN) Time Complexity============================");
		// O(logN) time complexity algorithm
		algorithm.OLogNTimeComplexity(arr);

		System.out.println("=============O(NlogN) Time Complexity============================");
		// O(NlogN) time complexity algorithm
		algorithm.ONLogNTimeComplexity(arr);

		System.out.println("=============O(MN) Time Complexity============================");
		// O(MN) time complexity algorithm
		algorithm.OMNTimeComplexity(arr);

	}

}
