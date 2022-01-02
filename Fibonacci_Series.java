// Write a program to print fibonacci series.

import java.util.*;  
public class Fibonacci_Series{
    public static void main (String[] args){
        
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter The No of Elements: "); 
        int n=sc.nextInt();

        int a=0,b=1,s;
        for(int i=2;i<n;++i){
            s=a+b;
            System.out.println(""+s);
            a=b;
            b=s;
        }
        sc.close(); 
    }
}
