package java_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareSum {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("正の整数を入力してください。");
		String line;
		try {
			line = reader.readLine();
			int n = Integer.parseInt(line);
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i * i;
			}
			System.out.println("1から" + n + "までの二乗和は" + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
