package com.qa.java;

public class OddNumbers {

	public static void main(String[] args) {

		/*
		 * print all odd numbers from 1-1000
		 */
		int numbers;
		numbers = 1;
		while (numbers <= 1000) {
			if (numbers % 2 != 0)
				System.out.println(numbers);
			numbers++;
		}
	}

}
