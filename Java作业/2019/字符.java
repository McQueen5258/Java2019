package Eric;

import java.util.Scanner;

public class 字符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		    char c;
		     
		    int code;
			String str = new String("a String");
			str = in.next();
			c = (str.charAt(0)) ;
			code = (int) c;
		System.out.println(code);
	}

}
