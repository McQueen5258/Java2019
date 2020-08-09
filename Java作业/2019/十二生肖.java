package Eric;

import java.util.Scanner;

public class 十二生肖 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] shiershengxioa= {"鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪"};
        int year =in.nextInt();
        year=year%12;
        year=year-3-1;
        if (year<4){
            year=year-3-1;
            year=12-year;
        }

        System.out.println(year);

		// TODO Auto-generated method stub

	}

}
