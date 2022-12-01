package com.example.assigment.exception;

public class Q8 {
	
	public static void main(String[] args) throws PasswordException {
		isValid("rrt#$$1273l");
	}

	public static void isValid(String password) throws PasswordException {

		String strSpecial = "!@#$%^&*()-_=+:;'.,~|?></{}\"\\[]";
		String strNum = "1234567890";
		String s;
		int specialCount = 0;

		if (!((password.length() >= 8) && (password.length() <= 14))) {
			s = "Password length should be between 8 to 14 characters.";
			throw new PasswordException(s);
		}
		if (password.contains(" ")) {
			s = "Password should not contain any space.";
			throw new PasswordException(s);
		}

		if (true) {
			int count = 0;
			for (char c : password.toCharArray()) {
				for (char ch : strNum.toCharArray()) {
					if (c == ch) {

						count++;
					}
				}
			}
			if (count < 2) {
				s = "Password should contain atleast two digit(0-9)";
				throw new PasswordException(s);
			}
		}

		for (char c : password.toCharArray()) {
			for (char d : strSpecial.toCharArray())
				if (c == d) {
					specialCount++;
				}
		}
		if (specialCount < 2) {
			s = "Password should contain atleast two special character";
			throw new PasswordException(s);
		}

		if (true) {
			int count = 0;
			for (String s1 : password.split("")) {
				
				for (int i = 65; i <= 90; i++) {
					char c = (char) i;
					String str1 = Character.toString(c);
					if (s1.equals(str1)) {
						count++;
					}
				}
			}
			if (count < 2) {
				s = "Password should contain at" + " two uppercase letter(A-Z)";
				throw new PasswordException(s);
			}
		}
		if (true) {
			int count = 0;
			for (String s1 : password.split("")) {
				for (int i = 97; i <= 122; i++) {
					char c = (char) i;

					String str1 = Character.toString(c);
					if (s1.equals(str1)) {
						count++;
					}
				}
			}
			if (count < 2) {
				s = "Password should contain at" + " two lower letter(a-z)";
				throw new PasswordException(s);
			}
		}

		System.out.println("Password satisfies the condition");
	}

}

class PasswordFormatException extends Exception {

	private static final long serialVersionUID = 1L;
	int passwordConditionViolated = 0;

	public PasswordFormatException(String s) {
		super("Invalid Password: " + s);
	}

}