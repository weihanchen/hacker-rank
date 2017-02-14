import java.util.*;
import java.math.*;

public class Day2 {

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double percentBase = 100.0;
        double tip = tipPercent / percentBase;
        double tax = taxPercent / percentBase;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + mealCost * tip + mealCost * tax);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
}
}
