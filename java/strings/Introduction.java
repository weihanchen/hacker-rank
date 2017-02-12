import java.io.*;
import java.util.*;

public class Introduction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lengthOfA = A.length();
        int lengthOfB = B.length();
        int lengths = lengthOfA + lengthOfB;
        Boolean isALargerThenB = A.compareTo(B) >= 1;
        String capitalizedA = getCapitalizeFirstChartText(A);
        String capitalizedB = getCapitalizeFirstChartText(B);
        String concatText = capitalizedA.concat(" ").concat(capitalizedB);
        System.out.println(lengths);
        System.out.println(getBooleanText(isALargerThenB));
        System.out.println(getCapitalizeFirstChartText(concatText));
    }

    private static String getBooleanText(Boolean b) {
        return b?"Yes":"No";
    }

    private static String getCapitalizeFirstChartText(String text) {
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
 }
