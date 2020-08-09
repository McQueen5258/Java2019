package Eric;

import java.util.Scanner;

public class 收银机 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("您好");
    	Scanner in = new Scanner (System.in);
//    	System.out.printIn("echo":+in.nextline());
    	double amount=100;
    	double price=0;
    	System.out.print("请输入实收:");
    	amount = in.nextDouble();
    	System.out.print("请输入应收:");
    	price = in.nextInt();
		System.out.println(amount>=100);
		System.out.println(amount+"-"+price+"="+(amount-price));
	}

}
