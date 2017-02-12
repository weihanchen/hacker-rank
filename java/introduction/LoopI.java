import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoopI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int multiples = 10;
        for (int multiple = 1;multiple <= multiples; multiple++) {
              System.out.println(N + " x " + multiple + " = " + (N * multiple));
        }
    }
}
