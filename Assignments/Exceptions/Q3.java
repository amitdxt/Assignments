

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q3 {

	public static void main(String[] args) {
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader("Desktop\\Project.txt"))) {
			while ((line = br.readLine()) != null) {
				System.out.println("Line :" + line);
			}
		} catch (IOException e) {
			System.out.println("IOException in try block :" + e.getMessage());
		}
	}
}
