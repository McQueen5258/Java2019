package Eric;

import java.util.Scanner;

public class 数独 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a=9;
		int b=9;
		int[][]hanglie= new int[a][b];

		for(int j=0;j<a;j++) {
			for(int i=0;i<b;i++) {
				hanglie[i][j]=in.nextInt();
				System.out.println(hanglie[i][j]);
			}
		}
		
	}

}
