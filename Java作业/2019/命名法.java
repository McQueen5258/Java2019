package Eric;

import java.util.Scanner;

public class 命名法 {
	
	private static final Object UNDERLINE = null;

	public static String main(String[] args) {

        String str = null;
		if (str == null || str.trim().isEmpty()){  
            return "";  
        }
 
        int len = str.length();  
        StringBuilder sb = new StringBuilder(len);  
        for (int i = 0; i < len; i++) {  
            char c = str.charAt(i);  
            if (Character.isUpperCase(c)){  
                sb.append(UNDERLINE);  
                sb.append(Character.toLowerCase(c));  
            }else{  
                sb.append(c);  
            }  
        }
		return str;  
 


  }
}