import java.util.Scanner;

public class 新十二生肖 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] ShiErshengXioaH= {"羊","猴","鸡","狗","猪","鼠","牛","虎","兔","龙","蛇","马"};
        int dw=0;
        int year =in.nextInt();
        if (year>=2003){
        dw = year-2003;
        dw=dw%12;
    }
        if (year<2003){
            dw = 2003-year;
            dw=dw%12;
            dw=12-dw;
        }
        System.out.println(ShiErshengXioaH[dw]);
//        int dw = year%12;
//        System.out.println(shiershengxioa[dw-1-3]);
    }
}
