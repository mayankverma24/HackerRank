package com.hr.introduction;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-datatypes/problem
public class JavaDatatypes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			try {
				long x = s.nextLong();

				System.out.println(x + " can be fitted in:");
				if (x == (byte) x)
					System.out.println("* byte");
				if (x == (short) x)
					System.out.println("* short");
				if (x == (int) x)
					System.out.println("* int");
				if (x == (long) x)
					System.out.println("* long");
			} catch (Exception e) {
				System.out.println(s.next() + " can't be fitted anywhere.");
			}

		}
		s.close();
	}

}
