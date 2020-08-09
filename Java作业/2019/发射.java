package Eric;

import java.util.Scanner;

public class 发射 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int count = in.nextInt();
		int sum = a;

		System.out.print(a);
		while (count >1) {
//        	System.out.println(count);
			a = a + 1;
			
			System.out.print("+" + a);
			count = count - 1;
			sum = sum + a;
		}
		System.out.print("=" + ( + sum));
//        System.out.println(count);
//        System.out.println("发射");

	}

}
