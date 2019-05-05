package java730;

public class DrawGraph3_while {
	public static void main(String[] args) {
		int i = 0;
		{
			while (i < 10) {
				System.out.print(i + ":");
				int j = 0;
				while (j < i * i) {
					System.out.print("*");
					j++;
				}
				System.out.println("");
				i++;
			}
		}
	}
}
