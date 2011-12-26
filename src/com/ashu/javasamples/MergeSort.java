package com.ashu.javasamples;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 7, 6, 3, 1, 4, 8 };
		Merge merge = new Merge();
		merge.setArray(arr);
		merge.sort(0, arr.length - 1);
		int[] result = merge.getArray();

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}

class Merge {
	
	private int[] array;
	private int[] result;
	private int resultIndex = 0;

	public void setArray(int[] a) {
		array = a;
	}

	public int[] getArray() {
		return result;
	}

	public void sort(int start, int end) {

		int mid = (start + end) / 2;
		if (start <= end) {
			sort(start, mid);
			sort(mid + 1, end);
			merge(start, mid, end);
		}
		return;
	}

	private void merge(int start, int mid, int end) {
		int s1 = start;
		int s2 = mid + 1;

		while (s1 <= mid && s2 <= end) {
			if (array[s1] < array[s2]) {
				result[resultIndex++] = array[s1];
				s1++;
			} else if (array[s1] > array[s2]) {
				result[resultIndex++] = array[s2];
				s2++;
			} else {
				result[resultIndex++] = array[s1];
				s1++;
				s2++;
			}
		}

		while (s1 <= mid) {
			result[resultIndex++] = array[s1++];
		}

		while (s2 <= end) {
			result[resultIndex++] = array[s2++];
		}

	}

}
