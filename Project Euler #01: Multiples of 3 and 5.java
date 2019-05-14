import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum = 0;
        if (t >= 1 && t <= 100000)
            for (int a0 = 0; a0 < t; a0++) {
                int n = in.nextInt();
                sum = 0;
                if (n > 0 && n <= 1000000000) {
                    long three = (n - 1) / 3; 
                    long five = (n - 1) / 5; 
                    long fifteen = (n - 1) / 15; 
                    long SumThree = three * (6 + (three - 1) * 3) / 2;
                    long SumFive = five * (10 + (five - 1) * 5) / 2;
                    long SumFifteen = fifteen * (30 + (fifteen - 1) * 15) / 2;
                    sum = SumThree + SumFive - SumFifteen;                         
                }
                System.out.println(sum);
           }
    }
}
