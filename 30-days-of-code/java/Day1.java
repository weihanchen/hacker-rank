import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        double inputDouble = scan.nextDouble();
        scan.nextLine();
        String inputString = scan.nextLine();
        System.out.println(i + inputInt);
        System.out.println(d + inputDouble);
        System.out.println(s.concat(inputString));
        scan.close();
    }
}
