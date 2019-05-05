package java730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kakutani {
	public static void main(String[] args) {
		int count=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("整数を入力して下さい。");
			String line = reader.readLine();
			int number = Integer.parseInt(line); // 文字列をint型に変換する
		while(number!=1) {
			
			count++;
			if (number % 2 == 0) {
					number = number / 2;
			} else {
				number = number * 3 + 1;
			}
				System.out.println(count + "回: " +number );
		}
			System.out.println(count + "回で1になりました。");
			
		
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字の形式が正しくありません。");
		}
	}
}
