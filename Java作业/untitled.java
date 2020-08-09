package Eric;

import java.util.Scanner;

public class 猜数游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = (int) (Math.random() * 1000+ 1); // [0,1)-->[0,100)-->[1,100]
		int a;
		int count = 0;
		do {
			a = in.nextInt();
			count = count + 1;
			if (a > number) {
				System.out.println("第一次");
			} else if (a < number) {
				System.out.println("偏小");
			}

		} while (a != number);
		System.out.println("恭喜你猜对了" + count + "次");
	}

}
