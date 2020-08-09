package Eric;

import java.util.Scanner;

public class 平均数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[10]; 
		for(int i = 0; i < numbers.length;i++) 
		{
			numbers[i]=in.nextInt();
		}
		int li =in.nextInt();
		System.out.println(numbers[li-1]);
	}

}
