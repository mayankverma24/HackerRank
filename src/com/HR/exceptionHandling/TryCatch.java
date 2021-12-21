package com.HR.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			int y = s.nextInt();
			s.close();
			System.out.println(x / y);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getName() + ": / by zero");
		}
	}

}
