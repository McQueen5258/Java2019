package Eric;

import java.util.Scanner;

public class 乘法口诀 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double shui = 0;
		double zonggong = 0;

		if (n <= 500) {
			System.out.println((int)n);
		}
		if (500 < n & n <= 3600) {
			a = (n - 500) * 0.03;
			shui = n - a;
			
			System.out.println(a);
		}
		if (3601 < n & n < 14400) {
			a = 3100*0.03;
			b = (n-3600) * 0.1;
			shui = (int)(a+b);
			zonggong = n - shui;
			System.out.println((int)zonggong);
		}
		if (14401 <= n & n < 30000) {
			a = 3100*0.03;
			b = 10800*0.1;
			c = (n-14400) * 0.2;
			
			shui = (int)(a + b + c);
		    zonggong = n - shui;
			
			System.out.println((int)zonggong);
		}
		if (30001 <= n) {
			a = 3100*0.03;
			b = 10800*0.1;
			c = 15600*0.2;
			d = (n-30000)*0.5;
			shui = (int)(a + b + c + d);
			zonggong = n - shui;
			System.out.println((int)zonggong);
		}
	}
}