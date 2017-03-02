import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference = Integer.MIN_VALUE;

    Difference(int[] elements) {
       this.elements = elements;
    }

    public void computeDifference() {
       for (int i = 0; i < this.elements.length; i++) {
          for (int j = i + 1; j < this.elements.length; j++){
             int diff = this.elements[i] - this.elements[j];
             diff = Math.abs(diff);
             if (diff > this.maximumDifference) this.maximumDifference = diff;
          }
       }
    }

  } // End of Difference class

public class Day14 {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
          a[i] = sc.nextInt();
      }
      sc.close();

      Difference difference = new Difference(a);

      difference.computeDifference();

      System.out.print(difference.maximumDifference);
  }
}
