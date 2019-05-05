package java_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenSum {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("正の整数を入力してください。");
		String line;
		try {
			System.out.println("start");
			line = reader.readLine();
			int start = Integer.parseInt(line);
			if (start % 2 == 1) {
				System.out.println("偶数を入力してください。");
				return;
			}
			System.out.println("end");
			line = reader.readLine();
			int end = Integer.parseInt(line);
			if (end % 2 == 1) {
				System.out.println("偶数を入力してください。");
				return;
			}

			int sum = 0;
			for (int i = start; i <= end; i += 2) {
				sum += i;
			}
			System.out.println(start + "から" + end + "までの偶数の和は" + sum);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
