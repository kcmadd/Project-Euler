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
            int n = in.nextInt(), m = 200000;
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            boolean prime[] = new boolean[m+1]; 
                for(int i=0;i<m;i++) prime[i] = true; 
                for(int j = 2; j*j<=m; j++) 
                    if(prime[j] == true) 
                        for(int i = j*j; i <= m; i += j) 
                            prime[i] = false; 
            for(int k = 2; k <= m; k++)
                if(prime[k] == true) tmp.add(k);

            System.out.println(tmp.get(n-1)); 
        }
    }
}
