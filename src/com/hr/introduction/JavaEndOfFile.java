package com.hr.introduction;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-datatypes/problem
public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;

		while (s.hasNext()) {
			count++;
			System.out.println(count + " " + s.nextLine());
		}
		s.close();
	}

}
