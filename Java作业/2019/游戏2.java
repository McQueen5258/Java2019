package Eric;

import java.util.Scanner;

public class 游戏2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int kecheng = 0;
		int weizhi = 1;
		int dong = 1;
		int nan = 2;
		int xi  = 3;
		int bei = 4;
		System.out.println("游戏从大门开始。你可以四处探索一下。");
		while (true) {
			System.out.println("请输入移动方向：");
			int fangxiang = in.nextInt();
			if (fangxiang == xi & weizhi == 1) {
				System.out.println("你到了[教学楼]。一堂生动的编程课正在进行。");
				weizhi = 2;
				kecheng = kecheng + 1;
			} else if (fangxiang == bei & weizhi == 1) {
				System.out.println("你到了[拐角]。四周一片荒芜。");
				weizhi = 3;
			} else if (weizhi == 3 & fangxiang == nan || weizhi == 2 & fangxiang == dong) {
				System.out.println("你到了[大门]。要去哪？");
				weizhi = 1;
			} else if (weizhi == 1 & fangxiang == nan & kecheng == 0) {
				System.out.println("你还没有上课，别那么急着离开吧。");
			} else if (weizhi == 1 & fangxiang == nan & kecheng != 0) {
				System.out.println("你离开了学堂。");
				System.out.println("你一共上了" + kecheng + "节编程课。游戏结束。");
				break;
			} else {
				System.out.println("那边好像没有路了……你只好回到原地。");
			}
		}
	}
}