import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
            long sum = 0;
            boolean prime[] = new boolean[1000000+1]; 
            long prime2[] = new long[1000000+1];
            
            for(int i=2;i<=1000000;i++) prime[i] = true; 
            
            for(int j = 2; j*j<=1000000; j++) 
                if(prime[j])
                    for(int i = j*2; i <= 1000000; i += j) 
                        prime[i] = false;  
           
            for(int f=2;f<=1000000;f++){
                if(prime[f]) sum+=f;
                prime2[f]=sum;
            }
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){  
            int n = in.nextInt();          
            System.out.println(prime2[n]);
        }
    }
}
