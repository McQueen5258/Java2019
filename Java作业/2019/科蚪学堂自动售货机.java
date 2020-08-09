package Eric;

import java.util.Scanner;

public class 科蚪学堂自动售货机 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		菜单
		System.out.println("欢迎使用科蚪实务学堂自动售货机");
		System.out.println("您可以购买");
		System.out.println("1.本子。2.5元");
		System.out.println("2.辣条。2元");
		System.out.println("3.苹果电脑。6899元");
		System.out.println("4.iPhoneXSmax。13488元");
		System.out.println("请输入物品代码");
//		选择菜单物品
		Scanner in = new Scanner(System.in);
		int daima = in.nextInt();
//    	本子
		if (daima == 1) {
			System.out.println("您选择的是:本子");
			System.out.println("请投币");
			double benzi = in.nextDouble();
			if (benzi >= 2.5) {
				System.out.println("本子：2.5元");
				System.out.println("找零" + (benzi - 2.5) + ",谢谢光临（≧∇≦）");
			}
			if (benzi < 2.5) {
				System.out.println("本子：2.5元");
				System.out.println("不够，你比我还穷吗？请在回去在拿点钱吧~_~;");

			}

		}
//    	辣条
		if (daima == 2) {
			System.out.println("你选择的是:辣条");
			System.out.println("请投币");
			double latiao = in.nextDouble();
			if (latiao >= 2) {
				System.out.println("辣条：2元");
				System.out.println("找零" + (latiao - 2) + ",谢谢光临(^O^)");
				if (latiao < 2) {
					System.out.println("辣条：2元");
					System.out.println("你为什么这么穷，辣条都买不起(~_~;)");
				}
			}

		}
//    	苹果电脑
		if (daima == 3) {
			System.out.println("你选择的是:Macbook");
			System.out.println("请投币");
			double Macbook = in.nextDouble();
			if (Macbook >= 6899) {
				System.out.println("Macbook：6899元");
				System.out.println("找零" + (Macbook - 6899) + ",真有钱$_$");
			}
			if (Macbook < 6899) {
				System.out.println("Macbook：6899元");
				System.out.println("余额不足，看来你也是果粉♪（ｖ＾＿＾）ｖ");
			}
		}
//    	iPhoneXSmax
		if (daima == 4) {
			System.out.println("你选择的是:iPhoneXSmax");
			System.out.println("请投币");
			double iphoneXSmax = in.nextDouble();
			if (iphoneXSmax >= 13488) {
				System.out.println("iphoneXSmax:13488");
				System.out.println("找零" + (iphoneXSmax - 13488) + "，哇，你太有钱了吧(☆_☆)");
			}
			if (iphoneXSmax < 13488) {
				System.out.println("iphoneXSmax:13488");
				System.out.println("余额不足，你还是买iPhone7以上吧~_~;");
			}
		}
		if (daima == 5) {
			System.out.println("请选择物品代码-_-#");

		}
		if (daima <= 0) {
			System.out.println("请选择物品代码-_-#");
		}

	}
}
