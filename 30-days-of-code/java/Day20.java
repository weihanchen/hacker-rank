import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for (int a_i = 0; a_i < n; a_i++) {
         a[a_i] = in.nextInt();
      }
      int numberOfSwaps = 0;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n - 1; j++) {

            if (a[j] > a[j + 1]) {
               int tmp = a[j];
               a[j] = a[j + 1];
               a[j + 1] = tmp;
               numberOfSwaps++;
            }
         }

         if (numberOfSwaps == 0) {
            break;
         }
      }
      System.out.printf("Array is sorted in %d swaps.\n", numberOfSwaps);
      System.out.printf("First Element: %d\n", a[0]);
      System.out.printf("Last Element: %d\n", a[a.length - 1]);
   }
}
