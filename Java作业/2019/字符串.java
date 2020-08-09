package Eric;

import java.util.Scanner;

public class 字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String str;
        String result;

        str = in.next();
        switch (str) {
            case "获取某一个位置的字符":
                result = "charAt";
                break;
            case "判断字符串内容是否相同":
            	result = "equals";
            	break;
            case "比较大小":
            	result = "compareTo";
            	break;
            case "得到子串":
            	result = "substring";
            	break;
            case "寻找字符":
            	result = "indexOf";
            	break;
            case "判断是否以xxx开始":
            	result = "substring";
            	break;
            case "全部转成大写":
            	result = "toUpperCase";
            	break;
            case "全部转成小写":
            	result = "toLoweCase";
            	break;
            case "获得长度":
            	result = "length";
            	break;
            default:
                result = "你输入是不是搞错了？";
                break;
        }

        System.out.println(result);
	}

}
