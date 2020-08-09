12package Eric;

import java.util.Scanner;

public class Eric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始");
		Scanner in = new Scanner(System.in);
//    	System.out.printIn("echo":+in.nextline());
		int amount = 100;
		int price = 0;
		System.out.print("请输入票面:");
		amount = in.nextInt();
		System.out.print("请输入金额:");
		price = in.nextInt();
		System.out.println(amount + "-" + price + "=" + (amount - price));
	}

}
