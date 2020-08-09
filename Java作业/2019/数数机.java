package Eric;

import java.util.Scanner;

public class 数数机 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      初始化
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int wo = 0;
		do
		{
			number = number / 10;
			wo = wo + 1;
			System.out.println("number=" + number + ";wo=" + wo);
		}while (number > 0);
		System.out.println(wo);
	}

}
