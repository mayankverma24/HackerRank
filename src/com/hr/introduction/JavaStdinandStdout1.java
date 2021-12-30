package com.hr.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStdinandStdout1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();		
		String b = br.readLine();
		String c = br.readLine();
		
		System.out.println(a);
		System.out.println(b);		
		System.out.println(c);

	}

}
