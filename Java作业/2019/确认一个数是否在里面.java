package Eric;

import java.util.Scanner;

public class 确认一个数是否在里面 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] data = {3,2,5,7,4,9,11,34,12,28};
		int x = in.nextInt();
		int loc = -1;
		for(int i = 0; i<data.length;i++)
		{
			if(x == data[i])
			{
			loc = i;
			break;
			}
		}
		if(loc > -1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System.out.println(x+"不在其中");
		}
			
	}

}
