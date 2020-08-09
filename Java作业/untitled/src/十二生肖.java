import java.util.Scanner;

public class 十二生肖 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] shiershengxioa= new String[12];
        shiershengxioa[0]="鼠";
        shiershengxioa[1]="牛";
        shiershengxioa[2]="虎";
        shiershengxioa[3]="兔";
        shiershengxioa[4]="龙";
        shiershengxioa[5]="蛇";
        shiershengxioa[6]="马";
        shiershengxioa[7]="羊";
        shiershengxioa[8]="猴";
        shiershengxioa[9]="鸡";
        shiershengxioa[10]="狗";
        shiershengxioa[11]="猪";
        int year =in.nextInt();
        year=year%12;
        if (year>=4){
            year=year-3-1;
        }
        if (year<4){
            year=12-year;
        }

        System.out.println(shiershengxioa[year]);
    }
}