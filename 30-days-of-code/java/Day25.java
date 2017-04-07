import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day25 {
	public static String isPrime(int data) {
		if (data == 1) return "Not prime";
		int sqrtData = (int)Math.sqrt(data);
		for (int i = 2; i <= sqrtData; i++) {
			if ((data % i) == 0) return "Not prime";
		}
		return "Prime";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int data = sc.nextInt();
			System.out.println(isPrime(data));
		}
	}
}