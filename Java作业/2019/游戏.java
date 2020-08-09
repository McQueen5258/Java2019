package Eric;

import java.util.Scanner;

public class 游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("游戏从大门开始。你可以四处探索一下。");
		System.out.println("请输入移动方向：");
		int weizhi;
		int fangxiang = in.nextInt();
		int dong = 1;
		int nan = 2;
		int xi = 3;
		int bei = 4;
		int kecheng = 0;
		weizhi = 1;
		while (true) {
			while (fangxiang == dong & weizhi == 1) {
				System.out.println("你到了[拐角]。四周一片荒芜。");
				System.out.println("请输入移动方向：");
				weizhi = 4;
				fangxiang = in.nextInt();

				while (fangxiang == nan & weizhi == 4) {
					System.out.println("你到了[大门]。要去哪？");
					System.out.println("请输入移动方向：");
					weizhi = 1;
					fangxiang = in.nextInt();

				}
				while (fangxiang != nan & weizhi == 4) {
					if (fangxiang <= 4 & fangxiang >= 1) {
						System.out.println("那边好像没有路了……你只好回到原地。");
						System.out.println("请输入移动方向：");
					}
					weizhi = 4;
					fangxiang = in.nextInt();
				}
				if (weizhi == 4 & fangxiang == nan) {
					System.out.println("你到了[大门]。要去哪？");
					System.out.println("请输入移动方向：");
					weizhi = 1;
					fangxiang = in.nextInt();
				}
			}
			while (fangxiang == xi & weizhi == 1 ) {
				System.out.println("你到了[教学楼]。一堂生动的编程课正在进行。");
				System.out.println("请输入移动方向：");
				kecheng = kecheng + 1;
				weizhi = 3;
				fangxiang = in.nextInt();
			}
            if(fangxiang == xi & weizhi == 3) {
            	
            }
            	
            
		
            while (fangxiang == xi & weizhi == 3) {	
            	{
            }
          }
	   }
    }
}