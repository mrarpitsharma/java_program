//package Basics;
import java.util.*;
class wavelengthCalculator
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter n1 and n2");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n,m;
        n=n1*n1;
        m=n2*n2;
        int lcm;
        lcm=1/n-1/m;
        int k;
        k=912*lcm;
        System.out.println(k);
     }
 }