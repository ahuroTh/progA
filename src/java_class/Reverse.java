package java_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("文字列を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			String reverse = "";
			for (int i = line.length() - 1; i >= 0; i--) {
				char c = line.charAt(i);
				reverse += c;
			}

			System.out.println("\"" + line + "\"のさかさまは\"" + reverse + "\"です。");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
