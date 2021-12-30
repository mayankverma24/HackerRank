package com.hr.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

	/*
	 * Complete the 'reverseArray' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static List<Integer> reverseArray(List<Integer> a) {
		return a;
		/*
		 * ArrayList<Integer> arr = new List<Integer>(ArrayList<>().a);
		 * 
		 * for (int i = 0; i < a.size(); i++) { int[] res = arr[i]; } return a;
		 */

	}

}

public class ArraysDS {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}

		List<Integer> res = Result.reverseArray(arr);

		for (int i = 0; i < res.size(); i++) {
			bufferedWriter.write(String.valueOf(res.get(i)));

			if (i != res.size() - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
