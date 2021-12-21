package com.HR.gfg;

import java.util.Scanner;

public class FindFourElements {

	public static void main(String[] args) {
		System.out.println("Please enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fact_using_recursion(num));
//		int fac = 1;
//		for (int i = 1; i <= num; i++) {
//			fac = i * fac;
//		}
//		System.out.println(fac);
		sc.close();
	}

	public static int fact_using_recursion(int num) {
		if (num < 1) {
			return 1;
		} else {
			return num * fact_using_recursion(num - 1);
		}
	}
}