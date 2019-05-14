import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long j = (long)Math.pow(((1 + n)*n/2), 2);
            long k = (n*(n+1)*(2*n+1))/6; // x1^2 +...xn^2
           System.out.println(j-k);
        }
    }
}
