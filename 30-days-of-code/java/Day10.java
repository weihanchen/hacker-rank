import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getMaxContinusCount(n, 0 , -1));
    }

    private static int getMaxContinusCount(int num, int continusCount, int maxCount) {
        int digital = num % 2;
        if (digital == 1) continusCount++;
        else continusCount = 0;
        if (continusCount > maxCount) maxCount = continusCount;
        if (num > 0) return getMaxContinusCount(num / 2, continusCount, maxCount);
        return maxCount;
    }

}
