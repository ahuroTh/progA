package java730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digits {
	public static void main(String[] args) {
		long count = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("正の整数を入力して下さい。");
			String line = reader.readLine();
			long number = Long.parseLong(line); // 文字列をint型に変換する
			long newNumber = number;

			if (number > 0) {
				while (number >= 1) {
					count++;
					number = number / 10;
				}
			} else {
				System.out.println("数字の形式が正しくありません。");
				return;

			}
			System.out.println(newNumber + "は" + count + "桁の整数です。");

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字の形式が正しくありません。");
		}
	}
}
