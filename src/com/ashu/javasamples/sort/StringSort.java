package com.ashu.javasamples.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		String[] data = { "Kiwi", "Banana", "Mango", "Aubergine", "Strawberry" };
		List<String> list = Arrays.asList(data);
		Collections.sort(list);
		System.out.println(list);
	}
}
