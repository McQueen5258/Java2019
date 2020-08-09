import java.util.Scanner;

public class 画正方形 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hl=in.nextInt();
        for (int j =0;j<hl;j++){
            for (int i =0;i<hl;i++){
                if (j==0||j==hl-1){
                    System.out.print("*");
                }
                if (j!=0&j!=hl-1){
                for (i=0;i<hl;i++) {
                    if (i == 0 || i == hl-1) {
                        System.out.print("*");
                    }else if (i != 0 || i != hl-1){
                        System.out.print(" ");
                    }
                }

                }

            }
            System.out.println();
        }
    }
}
