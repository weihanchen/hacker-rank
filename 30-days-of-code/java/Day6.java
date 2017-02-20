import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0;i < T; i++) {
            String text = sc.next();
            int length = text.length();
            String evenIndexed = "";
            String oddIndexed = "";
            for (int j = 0; j < length; j++) {
                if (j % 2 == 0) evenIndexed += text.charAt(j);
                else oddIndexed += text.charAt(j);
            }
            System.out.println(evenIndexed + " " + oddIndexed);
        }
    }
}
