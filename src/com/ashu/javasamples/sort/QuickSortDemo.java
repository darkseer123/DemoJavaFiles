package com.ashu.javasamples.sort;

public class QuickSortDemo {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 1, 6, 3, 4, 2 };
		QuickSort sort = new QuickSort(arr);
		sort.sortArray(0, arr.length - 1);
		int[] result = sort.getArray();

		System.out.println("The sorted array is: ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}
	}
}

class QuickSort {

	private int[] array;

	QuickSort(int[] a) {
		array = a;
	}

	public void setArray(int[] arr) {
		array = arr;
	}

	public int[] getArray() {
		return array;
	}

	public void sortArray(int start, int end) {

		if (start < end) {
			int partition = partitionArray(start, end);
			sortArray(start, partition);
			sortArray(partition + 1, end);
		}

	}

	private int partitionArray(int start, int end) {
		
		int key = start;
		int up = start;
		int down = end;

		while (up < down) {

			while (up < end && array[key] >= array[up]) {
				up++;
			}

			while (down > start && array[key] < array[down]) {
				down--;
			}
			
			swap(key, down);
			key = down;
			
		}
		
		return key;
	}

	private void swap(int a, int b) {
		int c = array[a];
		array[a] = array[b];
		array[b] = c;
	}

}
