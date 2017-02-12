import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int limitOfStringLength = 15;
            int leadingZeroSize = 3;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String text = fillSpaceOfString(s1, limitOfStringLength) + convertToLeadingZeros(x, leadingZeroSize);
                System.out.println(text);
            }
            System.out.println("================================");

    }

    private static String convertToLeadingZeros(int number, int digitalOfSize) {
           String result = String.valueOf(number);
           while (result.length() < digitalOfSize) {
              result = '0' + result;
           }
           return result;
    }

    private static String fillSpaceOfString(String text, int limitOfLength) {
           int textLength = text.length();
           String result = text;
           for (int i = textLength; i < limitOfLength; i++) {
                result += ' ';
           }
           return result;
    }
}
