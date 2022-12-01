

import java.util.Scanner;

class Parent {
	int max;

	int calculateMax(int a[], int n) {
		try {

			max = a[0];
			for (int i = 0; i < n; i++) {
				if (max < a[i]) {
					max = a[i];
				}
			}
			System.out.println("Maximum of N numbers is:" + max);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return max;
	}
}

class Child extends Parent {
	int calculateMax(int a[], int n) {
		int average = 0, sum = 0;
		try {

			for (int i = 0; i < n; i++) {
				sum += a[i];
			}
			average = sum / n;
			System.out.println("average of N numbers is:" + average);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return average;

	}
}

public class Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements :");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		Child ch= new Child();
		ch.calculateMax(a, n);

	}

}
