package com.HR.introduction;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-loops/problem
public class JavaLoops2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for (int i = 0; i < q; i++) {

			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			for (int j = 0; j < n; j++) {
				a += (Math.pow(2, j) * b);
				System.out.printf("%d ", a);
			}
			System.out.println();
		}
		s.close();
	}

}
