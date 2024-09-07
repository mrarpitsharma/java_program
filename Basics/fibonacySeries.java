//package Basics;
import java.util.*;
class fibonacySeries
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of fibonacy series you wanted!!!");
        int n=sc.nextInt();
        int k=0;int t=1;
        for(int i=0;i<=n;i++)
         {
            int temp=k+t;
            k = t;
            t=temp;
            System.out.println(temp);
         }
     }
 }