package com.yash.oops.program;

import java.util.Scanner;

public class AreaQ4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter You want to find area of ");

		System.out.println("for Area Of Square press    : 1");
		System.out.println("for Area Of rectangle press : 2");
		System.out.println("for Area Of  triangle press : 3");

		int cirlceInput = scanner.nextInt();

		if (cirlceInput == 1) {

			areaOfSquare();

		}
		if (cirlceInput == 2) {

			areaOfRectangle();

		}
		if (cirlceInput == 3) {

			areaOfTriangle();

		}

	}

	public static void areaOfSquare() {

		System.out.println("Enter the First side ");

		int firstSide = sc.nextInt();

		double areaOfSquare = firstSide * firstSide;

		System.out.println("Area of Square=" + areaOfSquare);

	}

	public static void areaOfRectangle() {

		System.out.println("Enter the First side ");

		int firstSide = sc.nextInt();

		System.out.println("Enter the Second side ");

		int secondSide = sc.nextInt();

		double areaOfRectangle = firstSide * secondSide;

		System.out.println("Area of Rectangle=" + areaOfRectangle);

	}

	public static void areaOfTriangle() {

		System.out.println("Enter the side ");

		int firstSide = sc.nextInt();

		System.out.println("Enter the Second side ");

		int secondSide = sc.nextInt();

		double areaOfTriangle = (firstSide * secondSide) / 2;

		System.out.println("Area of Triangle=" + areaOfTriangle);

	}
}


