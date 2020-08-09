package Eric;

import java.util.Scanner;

public class 艺术 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int kuan = in.nextInt();
		int gao = in.nextInt();
		int[][] a = new int[gao][kuan];
		for (int i = 0; i < gao; i++) {
			for (int j = 0; j < kuan; j++) {
				a[i][j] = in.nextInt();
				

			}
		}

		for (int m = 0,d=0; m < kuan; m++,d++) {
			for (int n = 0,b=gao-1; n < gao; n++,b--) {
				if (a[b][d] == 0) {
					System.out.print(" ");
				} else if (a[b][d] == 1) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
