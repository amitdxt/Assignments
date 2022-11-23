package com.yash.oops.program;

import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first String");

		String str1 = scanner.nextLine();

		System.out.println("Enter Second String");

		String str2 = scanner.nextLine();

		stringComparison st = new stringComparison();
		st.stringCompare(str1, str2);


	}

}
