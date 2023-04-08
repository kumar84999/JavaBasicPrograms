package com.Arrays;
import java.util.Arrays;

public class ArrayUttilDemo {
	

		// sorting , searching , iterating
		public static void main(String[] args) {
			int[] numbers = { 10, 20, 40, 60, 50, 30 };
			// for loops
			System.out.println(Arrays.toString(numbers));
			Arrays.sort(numbers);
			System.out.println(Arrays.toString(numbers));

			System.out.println(Arrays.binarySearch(numbers, 10));
			if (Arrays.binarySearch(numbers, 200) >= 0) {
				System.out.println(Arrays.toString(numbers));
			} else {
				System.out.println("there is no element");
			}
			
		}

}
