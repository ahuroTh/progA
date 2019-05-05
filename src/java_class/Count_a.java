package java_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_a {
	public static void main(String[] args) {
		System.out.println("文字列を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int countA = 0;
		try {
			String line = reader.readLine();
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c == 'a') {
					countA++;
				}
			}
			System.out.println("'a'の数は" + countA + "個です。");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}