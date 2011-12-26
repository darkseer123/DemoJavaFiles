package com.ashu.javasamples;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 1, 6, 3, 4, 2, 10, 9 };
		Merge merge = new Merge(arr);
		merge.setArray(arr);
		merge.sort(0, arr.length - 1);
		int[] result = merge.getArray();

		System.out.println("The sorted array is: ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}

class Merge {

	private int[] array;
	private int[] result;
	private int resultIndex;

	Merge(int[] a) {
		array = a;
		result = new int[a.length];
		resultIndex = 0;
	}

	public void setArray(int[] a) {
		array = a;
	}

	public int[] getArray() {
		return array;
	}

	public void sort(int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			sort(start, mid);
			sort(mid + 1, end);
			merge(start, mid, end);
		}
	}

	private void merge(int start, int mid, int end) {

		int s1 = start;
		int s2 = mid + 1;

		resultIndex = 0;

		while (s1 <= mid && s2 <= end) {
			if (array[s1] < array[s2]) {
				result[resultIndex++] = array[s1++];
			} else if (array[s1] > array[s2]) {
				result[resultIndex++] = array[s2++];
			} else {
				result[resultIndex++] = array[s1++];
				result[resultIndex++] = array[s2++];
			}
		}

		while (s1 <= mid) {
			result[resultIndex++] = array[s1++];
		}

		while (s2 <= end) {
			result[resultIndex++] = array[s2++];
		}

		for (int i = start, j = 0; i <= end; i++, j++) {
			array[i] = result[j];
		}
	}

}
