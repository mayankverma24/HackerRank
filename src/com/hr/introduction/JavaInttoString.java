package com.hr.introduction;

import java.util.Scanner;

public class JavaInttoString {
//https://www.hackerrank.com/challenges/java-int-to-string/problem
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		s.close();
		if (n >= -100 && n <= 100) {

			try {
				Integer.toString(n);
				String.valueOf(n);
				System.out.println("Good job");
			} catch (Exception e) {
				System.out.println("Wrong Answer");
			}
		} else {
			System.out.println("Wrong Answer");
		}
	}

}
