package com.Arrays;

public class ArraySearchDemo {
	public static void main(String[] args) {
		int elementToSearch = 10;
		int[] numbers = { 10, 20, 40, 60, 50, 30 };
// linear search
		for (int i = 0; i < numbers.length; i++) {
			if (elementToSearch == numbers[i]) {
				System.out.println(numbers[i]);
				break;
			} else {
				System.out.println("there is no element in the given array!............");
				break;
			}

		}
//		if ((elementToSearch == 0) && (elementToSearch != numbers.length)) {
//			System.out.println("there is no element in the given array!............");
//		}
	}

}

