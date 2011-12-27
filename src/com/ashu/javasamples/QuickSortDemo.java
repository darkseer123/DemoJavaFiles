package com.ashu.javasamples;

public class QuickSortDemo {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 1, 6, 3, 4, 2, 10, 9 };
		QuickSort sort = new QuickSort(arr);
		sort.setArray(arr);
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
			int key = partitionArray(start, end);
			sortArray(start, key);
			sortArray(key + 1, end);
		}

	}

	private int partitionArray(int start, int end) {
		int key = array[start];

		int up = start + 1;
		int down = end;

		while (up < down && up <= end && down >= start) {

			if (key < array[up]) {
				up++;
			}
			
			if (key > array[down]) {
				down--;
			}
			
			swap(up, down);
			
		}
		
		while (down < up - 1) {
			array[down] = array[down+1];
			down++;
		}
		
		array[down] = key;

		return down;
	}
	
	private void swap (int a, int b) {
		int c = array[a];
		array[a] = array[b];
		array[b] = c;
	}

}
