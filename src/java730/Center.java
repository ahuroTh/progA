package java730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Center {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			String space40 = "                                        "; // 空白40個
			while ((line = reader.readLine()) != null) {
				
				String hLine=line.substring(line.length()/2);
				String s = space40.substring(hLine.length()) + line;
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
