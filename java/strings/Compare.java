import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Compare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        int windowSize = in.nextInt();
        String largestPattern = text.substring(0, windowSize);
        String smallestPattern = largestPattern;
        int textLength = text.length();
        for (int i = 1; i <= (textLength - windowSize); i++) {
             int start = i;
             int end = start + windowSize;
             String pattern = text.substring(start, end);
             if (pattern.compareTo(largestPattern) >= 1) largestPattern = pattern;
             if (pattern.compareTo(smallestPattern) <= -1) smallestPattern = pattern;
        }
        System.out.println(smallestPattern);
        System.out.println(largestPattern);
    }
}
