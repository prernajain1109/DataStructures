package com.data.structure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoArrays {
	public static void main(String[] args) {
		Integer[] array1 = { 2, 7, 9, 10 };
		Integer[] array2 = { 1, 6, 9, 11 };
		System.err.println(mergeArrays(array1, array2).toString());
		mergeArraysUsingMap(array1, array2);
	}

	private static ArrayList<Integer> mergeArrays(Integer[] array1, Integer[] array2) {
		int i = 0, j = 0;
		ArrayList<Integer> result = new ArrayList<>();
		while (i < array1.length || j < array2.length) { // 0,1,2,3
			if (i < array1.length && array1[i] < array2[j]) {
				result.add(array1[i]);
				i++;
			} else {
				result.add(array2[j]);
				j++;
			}
		}
		return result;
	}

	private static void mergeArraysUsingMap(Integer[] array1, Integer[] array2) {
		Map<Integer, Boolean> res = new HashMap<>();
		for (int i = 0; i < array1.length; i++)
			res.put(array1[i], true);
		for (int i = 0; i < array2.length; i++)
			res.put(array2[i], true);
		res.keySet().stream().forEach(System.out :: print);

	}
}
