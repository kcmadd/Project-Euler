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
            long n = in.nextLong();
            long j = 0;
            while(n % 2 == 0){
                n/=2;
                j = 2;
            }
            for (int i = 3; i <= Math.sqrt(n); i+= 2){
                    while (n%i == 0){
                        j = i;
                         n /= i;
                    }
            }
            if(n>2) j = n;
            System.out.println(j);
        }
    }
}

