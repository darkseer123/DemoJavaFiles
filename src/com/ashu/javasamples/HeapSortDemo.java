package com.ashu.javasamples;

import java.util.ArrayList;

public class HeapSortDemo {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 7, 1, 6, 3, 4, 2 };

		// Create HeapSort Object
		HeapSort sort = new HeapSort(arr);

		// Sort the array
		sort.SortArray();

		// Print the sorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(sort.getArray()[i]);
		}

	}

}

class HeapSort {

	ArrayList<Integer> list = new ArrayList<Integer>();

	HeapSort(int[] arr) {
		for (int i : arr) {
			list.add(i);
		}
	}

	public int[] getArray() {
		int k = 0;
		int[] array = new int[list.size()];
		for (int i : list) {
			array[k++] = i;
		}

		return array;
	}

	public void SortArray() {
		int end = list.size() - 1;

		// Heapify the given broken array
		heapify(end);

		while (end > 0) {
			swapValues(0, end);
			end--;
			siftdown(0, end);
		}
	}

	private void heapify(int count) {
		int parent = count / 2 - 1;

		while (parent >= 0) {
			siftdown(parent, count - 1);
			parent--;
		}

	}

	private void siftdown(int start, int end) {
		int root = start;

		while (root * 2 + 1 <= end) {
			int child = root * 2 + 1;
			int swap = root;

			if (list.get(swap) < list.get(child)) {
				swap = child;
			}

			if (child + 1 <= end && list.get(swap) < list.get(child + 1)) {
				swap = child + 1;
			}

			if (swap != root) {
				swapValues(root, swap);
				root = swap;
			} else {
				return;
			}
		}

	}

	private void swapValues(int a, int b) {
		Object c = list.get(a);
		list.set(a, list.get(b));
		list.set(b, (Integer) c);
	}

}
