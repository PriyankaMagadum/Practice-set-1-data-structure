package com.synechron.array;

public class LargestSumContigiousSubArray {

	public void findLargestSumOfContigiousSubarray(int arr[]) {

		int minimumSum = 0;
		int sum = 0;
		int minIndex = 0;
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];

				if (sum > minimumSum) {
					minimumSum = sum;
					minIndex = i;
					maxIndex = j;
				}
			}
			sum = 0;
		}
		System.out.println("minIndex=" + minIndex + " maxIndex=" + maxIndex + " sum=" + minimumSum);
	}

	public static void main(String[] args) {
		LargestSumContigiousSubArray largestSumContigiousSubArray = new LargestSumContigiousSubArray();

		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		largestSumContigiousSubArray.findLargestSumOfContigiousSubarray(arr);

	}

}
