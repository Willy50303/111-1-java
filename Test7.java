import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		int grade = 0;
		String space = "";
		
		while (grade < 10) {
			System.out.print(space);
			System.out.printf("%d %n", grade);
			space = space + " ";
			grade = grade + 1;
		}
	}
}	