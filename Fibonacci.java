//Dynamic Programming + Recursion Approach

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fibonacci {
    private static int[] a;
    public static int fib(int n){
        if(a[n] == -1) {
            if (n <= 1) {
                return n;
            }
            a[n] = fib(n - 1) + fib(n - 2);
        }
        return a[n];
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Enter value of n: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* O(1) Complexity using formula.
        double phi = (1 + Math.sqrt(5)) / 2;
        int result = (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
        System.out.println(result);
        */

        a = new int[n+1];
        Arrays.fill(a,0,n+1,-1);
        System.out.println(n+"th fibonacci is "+fib(n));

    }
}
