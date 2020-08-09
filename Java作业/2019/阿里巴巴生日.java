package Eric;

import java.util.Scanner;

public class 阿里巴巴生日 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nian = in.nextInt();
		if(nian%400==0 || nian%4==0 & nian%100!=0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
     }
 }
