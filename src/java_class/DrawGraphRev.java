package java_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawGraphRev {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("正の整数を入力してください。");

		String line;
		try {
			line = reader.readLine();
			int input = Integer.parseInt(line);

			for (int i = 0; i < input; i++) {
				System.out.print(i + ":");
				for (int a = 0; a < i; a++) {
					System.out.print(" ");
				}
				for (int a = 0; a < input - i; a++) {
					System.out.print("*");

				}

				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}