package Eric;

import java.util.Scanner;

public class 密码 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int zhenmima = in.nextInt();
		int shurucishu = 0;
		
		while(true) {
			int  shulumima = in.nextInt();
			shurucishu = shurucishu + 1;
		if(100000 <= zhenmima && zhenmima<=999999  ){
			break;
		}
		}
		int  shulumima = in.nextInt();
		if(zhenmima == shulumima && shurucishu >=3) {
			System.out.println("欢迎回来！");
		
		
		}
		
   }
}
