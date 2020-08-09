import java.util.Scanner;

public class 我要去米国 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String huan =in.nextLine();
        double num =0;
        huan=huan.trim();
        String huan2="";
//        if(huan != null && !"".equals(huan)){
//            for(int i=0;i<huan.length();i++){
//                if(huan.charAt(i)>=48 && huan.charAt(i)<=57){
//                    huan2+=huan.charAt(i);
//                }
//            }
//
//        }

        if(huan.contains("lb")) {
            huan2 = huan.substring(0,huan.indexOf("l"));
            num = new Double(huan2);
            double lb = num*0.4535924;
            System.out.println((int)lb);
        }
        if(huan.contains("mile")){
            huan2 = huan.substring(0,huan.indexOf("m"));
            num = new Double(huan2);
            double mile = num* 1.60934;
            System.out.println((int)mile);
        }
    }
}