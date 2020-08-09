package Eric;

import java.util.Scanner;

public class 考高分 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        String[] name = new String[n];
        double[] fenshu = new double[n];

        String zgmz;
        int zgxh;
        int j = 0;
        double a = 0;
        String b = null;
        int c = 0;
        for (int i = 0; i < n; i++) {
            name[i] = in.next();
            fenshu[i] = in.nextDouble();

        }
        for (int i = 0; i < n - 1; i++) {
            if (fenshu[j] < fenshu[i+1])
            {
                j = i+1;
            }
        }
        double jiafen = 100/fenshu[j];
        double d = 0;
        for (int i = 0; i < n; i++) {
             d = fenshu[i]*jiafen;
             fenshu[i]= d;
             System.out.println( name[i]+":"+fenshu[i]);
        }

    }
}
