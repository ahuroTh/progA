package java_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("日付を入力してください。");

			String line = reader.readLine();
			int n = Integer.parseInt(line);
			if (n < 1 || n > 31) {
				System.out.println("日付が正しくありません。");
			} else {
				switch (n % 7) {
				case 0:
					System.out.println(n + "日は土曜日です。");
					break;
				case 1:
					System.out.println(n + "日は日曜日です。");
					break;
				case 2:
					System.out.println(n + "日は月曜日です。");
					break;
				case 3:
					System.out.println(n + "日は火曜日です。");
					break;
				case 4:
					System.out.println(n + "日は水曜日です。");
					break;
				case 5:
					System.out.println(n + "日は木曜日です。");
					break;
				case 6:
					System.out.println(n + "日は金曜日です。");
					break;
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("日付が正しくありません。");
		}
	}

}
