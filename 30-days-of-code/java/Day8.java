//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> book = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            book.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (book.containsKey(s)) {
                System.out.println(s + "=" + book.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
