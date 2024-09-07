//package Basics;
import java.util.*;
public class Calculator
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Arpit's Calculator");
        System.out.println("Input a number");
        int n=sc.nextInt();
        System.out.println("Enter Operation- '+','-','/','*'");
        //char c=sc.nextLine();
        char c=sc.next().charAt(0);
        System.out.println("Enter another number");    
        int m=sc.nextInt();  
        if(c=='+')
         {
             int f=n+m;
             System.out.println(f);
         }
         else if(c=='-')
         {
            int f=n-m;
            System.out.println(f);
         }
        else if(c=='/')
         {
            double f=0.0;
            f=n/m;
            System.out.println(f);
         }
         else if(c=='*')
         {
            int f=n*m;
            System.out.println(f);
         }

     }
 }