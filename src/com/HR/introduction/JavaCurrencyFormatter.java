package com.HR.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double payment = s.nextDouble();

		/*
		 * Create a new locale for India as there is no in-built locale for India in
		 * Java
		 */
		Locale INDIA = new Locale("en", "in");
		NumberFormat nfUSA = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nfIndia = NumberFormat.getCurrencyInstance(INDIA);
		NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US: " + nfUSA.format(payment));
		System.out.println("India: " + nfIndia.format(payment));
		System.out.println("China: " + nfChina.format(payment));
		System.out.println("France: " + nfFrance.format(payment));

		s.close();
	}

}
