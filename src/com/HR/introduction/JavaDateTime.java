package com.HR.introduction;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateTime {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int mm = s.nextInt();
		int dd = s.nextInt();
		int yy = s.nextInt();

		System.out.println(findDay(mm, dd, yy));

		s.close();
	}

	public static String findDay(int month, int day, int year) {

		LocalDate dt = LocalDate.of(year, month, day);
		return dt.getDayOfWeek().toString();
	}

}
