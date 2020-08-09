package Eric;

import java.util.Scanner;

public class 三角形 {
	
	public static void Triangle(String[] sjx,int sanjiaoxing,int a) {
//		for(int i1=0; i1< sanjiaoxing;i1++) {
		for(int i=0; i< sanjiaoxing-a;i++) {
//		String marksStr1 = sjx[0].substring(0,i-a);
			String shuchu=sjx[i];	
		System.out.print(shuchu);
		}
		System.out.println();

		}
		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sanjiaoxing = in.nextInt();
		String[] sjx = new String[sanjiaoxing];
		for(int i = 0; i< sanjiaoxing;i++) {
			sjx[i]="*";
		}
		for(int i1=0,a=0; i1< sanjiaoxing;i1++,a++) {
		Triangle(sjx,sanjiaoxing,a);
		}
	}

}
