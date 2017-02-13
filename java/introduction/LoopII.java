import java.util.*;
import java.io.*;

class LoopII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = 0;
            for (int j = 0;j < n;j++) {
               if (j == 0) sum += a;
               sum += (power(2, j) * b);
               System.out.print(sum);
               System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }

    private static int power(int x, int pow) {
        if (pow <= 0) return 1;
        return x * power(x, pow - 1);
    }
}
