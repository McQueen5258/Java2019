package Eric;

import java.util.Scanner;

public class for循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int factor = 1;
		for(int i=1; i<=n; i++ )
		{

			factor *=i;
		}
	   System.out.println(factor);

	}

}
