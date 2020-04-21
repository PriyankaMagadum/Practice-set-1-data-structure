package com.synechron.array;

public class SubArrayWithGivenSum {

	public void findSubArrayWithGivenSum(int arr[], int sum) {

		int minimumSum = 0;
		int sumOfElement = 0;
		int minIndex = 0;
		int maxIndex = 0;
		boolean breakCondition = false;

		for (int i = 0; i < arr.length; i++) {
			sumOfElement = sumOfElement + arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sumOfElement = sumOfElement + arr[j];
				if (sumOfElement == sum) {
					minimumSum = sum;
					minIndex = i;
					maxIndex = j;
					breakCondition = true;
					break;

				}
			}

			if (breakCondition) {
				break;
			}

			sum = 0;
		}
		System.out.println("minIndex=" + minIndex + " maxIndex=" + maxIndex + " sum=" + minimumSum);

	}

	public static void main(String[] args) {
		SubArrayWithGivenSum subArrayWithGivenSum = new SubArrayWithGivenSum();
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		subArrayWithGivenSum.findSubArrayWithGivenSum(arr, -3);
	}

}
