package com.data.structure.array;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverse("prerna"));
		System.out.println(reverseOptimized("My name is prerna"));
	}

	private static String reverseOptimized(String string) {
		return new StringBuilder(string).reverse().toString();
	}

	private static StringBuilder reverse(String input) {// O(n)
		StringBuilder result = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			result.append(input.charAt(i));
		}
		return result;
	}

}
