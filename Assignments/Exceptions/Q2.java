

import java.util.Scanner;

class LeaveExceedLimitException extends Exception {
	private static final long serialVersionUID = 1L;

	public LeaveExceedLimitException(String s) {
		super(s);
	}
}

class AbscondingException extends Exception {
	private static final long serialVersionUID = 1L;

	public AbscondingException(String s) {
		super(s);
	}
}

public class Q2{
	public static void main(String[] args) throws LeaveExceedLimitException, AbscondingException {
		double salary = 37000;

		System.out.println("Enter Attendance as per following format P for present,"
				+ "\nL for leave it will be paid leave, A for absent,"
				+ "\nN for no information about this day --- for the mention dates in number");
		Scanner sc = new Scanner(System.in);

		int[] presentdays = new int[30];
		for (int i = 0; i < presentdays.length; i++) {
			// System.out.print("Day"+i+" Attendance");
//			presentdays[i]=sc.next().charAt(0);
			presentdays[i] = 'P';
			if (i > 7 && i < 10) {
				presentdays[i] = 'L';
			}
			if (i > 17 && i < 19) {
				presentdays[i] = 'A';
			}
		}

		int present = 0, leave = 0, absent = 0, noInfo = 0;

		for (int i : presentdays) {
			if (i == 'P') {
				present++;
			} else if (i == 'L') {
				leave++;
			} else if (i == 'A') {
				absent++;
			} else if (i == 'N') {

				noInfo++;
			}
		}

		System.out.println("Present:" + present + " Leave:" + leave + " Absent:" + absent + " NoInformation:" + noInfo);

		int[] noinfoArr = new int[noInfo];
		int count = 0;
		for (int i = 0; i < presentdays.length; i++) {
			if (presentdays[i] == 'N') {
				noinfoArr[count] = i;
				count++;
			}
		}

		if (absent < 1) {
			if (noInfo >= 4) {
				if (isSequence(noinfoArr)) {
					System.out.println("its been " + noInfo + " days, with no information");
					throw new AbscondingException("Your salary will not be calculated");
				}
			} else if (leave > 2) {
				System.out.println("Total salary:" + salaryCal(salary, present - (leave - 2)));

				throw new LeaveExceedLimitException("Leave balance exceeded");

			} else {
				System.out.println("Total salary:" + salaryCal(salary, 30));
			}

		} else {
			if (noInfo >= 4) {
				if (isSequence(noinfoArr)) {
					System.out.println("its been " + noInfo + " days, with no information");
					throw new AbscondingException("Your salary will not be calculated");
				}
			} else if (leave > 2) {
				System.out.println("Total salary:" + salaryCal(salary, present - (leave - 2)));

				throw new LeaveExceedLimitException("Leave balance exceeded");
			} else {
				System.out.println("Total salary:" + salaryCal(salary, 30 - absent));
			}
		}

	}

	static double salaryCal(double salary, int days) {
		return (salary / 30) * days;
	}

	static boolean isSequence(int[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] == 1) {
				count++;
				if (count == 3) {
					return true;
				}
			} else {
				count = 0;
			}
		}

		return false;
	}
}
