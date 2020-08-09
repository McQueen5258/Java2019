package Eric;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class 函数 {

	private static char[] c;

	public static void hanshu(String[] str) {
		int d = 0;
		int weizhi = 0;
		for(int i = 0; i < str.length; i++) {
			int a1 = str[i].indexOf('+');	
		if (a1 != -1) {
			String marksStr1 = str[a1].substring(a1-1);
			String marksStr2 = str[a1].substring(a1+1);
			int a = Integer.parseInt(marksStr1);
			int b = Integer.parseInt(marksStr2);
			int c = a + b;	
			int e = c;
			d = e + c;
			}
		weizhi++;
		}
		System.out.println(d);
		for(int i = 0; i < str.length; i++) {
			int a2;
			a2 = str[i].indexOf('*');	
		if (a2 != -1) {
			String marksStr1 = str[i].substring(a2-1);
			String marksStr2 = str[i].substring(a2+1);
			int a;
			a = Integer.parseInt(marksStr1);
			int b;
			b = Integer.parseInt(marksStr2);
			int c = a * b;	
			int e = c;
			d = e * c;
	      }
		}
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int z = in.nextInt();
		int shuzu =z+z-1;
		String[] str = new String[shuzu];
		for(int i = 0; i < str.length; i++) {
		 str[i] =in.next();
		}
		hanshu(str);
	}
}
