package Eric;

import java.util.Scanner;

public class 自动售票机 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		初始化
		Scanner in = new Scanner(System.in);
		int balance = 0;
//	    读入投币金额
		System.out.print("请投币");
		while(true) {
		int amount = in.nextInt();
		balance = balance + amount;
		if (balance >= 10) {
//		打印车票
		System.out.println("***************");
		System.out.println("*  万达广场专线  *");
		System.out.println("*  VIP座位票  *");
		System.out.println("*  VIP票价：10  *");
		System.out.println("*****************");
//		计算并打印找零
		System.out.println("找零："+(balance-10));
		balance = 0;
		}
			
//		if (balance < 10)
		else
		{
		    System.out.print("当前余额不足，请投币");
		}
	}
		
	}

}
