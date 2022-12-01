

import java.util.Scanner;

public class Q9 {

	static int collerCount = 0;

	public static void getDetails(float standardSize) {

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter coller size");
			Float collerSize = scanner.nextFloat();
			if (collarSize >= (standardSize - (standardSize * 2 / 100))
					&& collarSize <= (standardSize + (standardSize * 2 / 100))) {
				collarCount++;
			}
		}
		try {
			if (collerCount > 5) {
				System.out.println("Total collers with accepted standard deviation: " + collerCount);
			} else {
				throw new CollarStandardDeviateException("Coller are not satisfy the standard deviation rate.");
			}

		} catch (CollerStandardDeviateException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the standard Coller size: ");
		Scanner sc = new Scanner(System.in);
		float standardSize = sc.nextFloat();
		getCollarDetails(standardSize);
	}
}

class CollarStandardDeviateException extends Exception {
	private static final long serialVersionUID = 1L;

	public CollarStandardDeviateException(String s) {
		super(s);
	}
}
