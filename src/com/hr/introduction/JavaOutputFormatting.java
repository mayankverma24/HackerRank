package com.hr.introduction;

import java.util.Scanner;

/*Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding
 *  of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's
 leading digits with zeroes.
*/public class JavaOutputFormatting {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);
		String str = null;
		int num = 0;
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			str = s.next();
			num = s.nextInt();
			System.out.printf("%-15s%03d%n", str, num);
		}

		System.out.println("================================");
		s.close();
	}
}