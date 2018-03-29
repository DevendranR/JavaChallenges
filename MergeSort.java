package test;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = { 12, 34, 32, 43, 23, 13, 41, 11, 9, 56 };

		// Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int low = 0;
		int high = array.length - 1;
		mergeSort(array, low, high);

		for (int i : array) {
			System.out.print(i + ",");
		}
	}

	private static void mergeSort(int[] array2, int low, int high) {
		if (high - low < 1) {
			return;
		}
		int mid = low + (high - low) / 2;

		mergeSort(array2, low, mid);
		mergeSort(array2, mid + 1, high);

		merge(array2, low, mid, high);

	}

	private static void merge(int[] array, int lowerIndex, int middle,
			int higherIndex) {
		int[] tempMergArr = new int[array.length];
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
	}
}
