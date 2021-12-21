package com.HR.introduction;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-static-initializer-block/problem
public class JavaStaticInitializerBlock {
	static int B, H;
	static {
		Scanner s = new Scanner(System.in);
		B = s.nextInt();
		H = s.nextInt();
		s.close();
		try {
			if (B <= 0 || H <= 0)
				throw new Exception("Breadth and height must be positive");
			else {
				System.out.println(B*H);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}

	}

	public static void main(String[] args) {
	
	}

}