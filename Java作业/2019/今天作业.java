package Eric;

import java.util.Scanner;


public class 今天作业 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int jawa;
//		int web;
//		 jawa = in.nextInt();
//		 web = in.nextInt();
//		 if (jawa >= 85 & web < 85) 
//		 {
//			 System.out.println("您荣获了jawa奖学金100！");
//		 }
//		 else if (jawa >= 85 & web >= 85)
//		 {
//			 System.out.println("您荣获了编程奖学金200！");
//		 }
//		 if (jawa < 85 & web >= 85) 
//		 {
//			 System.out.println("您荣获了web奖学金80！");
//		 }
		int n;
		n = in.nextInt();
		int[] xuehao = new int[n];
		String[] name = new String[n];
		double[] fenshu = new double[n];

		String zgmz;
		int zgxh;
		int j = 0;
		double a = 0;
		String b = null;
		int c = 0;
		for (int i = 0; i < n; i++) {
			xuehao[i] = in.nextInt();
			name[i] = in.next();
			fenshu[i] = in.nextDouble();

		}
		for (int i = 0; i < n - 1; i++) {
			if (fenshu[j] < fenshu[i+1])
			{
				j = i+1;
			}
		}
		

		System.out.println("分数最高的是" + name[j]);
		System.out.println(name[j] + "的学号是" + xuehao[j]);
		System.out.println(name[j] + "考了" + (int) fenshu[j] + "分");
		
//		for(int i=n;i > 0;i--) 
//		{
//		System.out.println(name[i-1]);
//		}
		//2019001
//		int m;
//		m = in.nextInt();
//		System.out.println("学号为"+m+"的同学叫做"+name[m-2019001]);
	}

}
