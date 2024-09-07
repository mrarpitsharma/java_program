//package Basics;
import java.util.*;
class pallindromeNumber
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check weather a number is pallindrome or number");
        int n=sc.nextInt();
        int k=0;int t=1;
        
         
            int temp=k+t;
            k = t;
            t=temp;
            if(n==t)
             {
                System.out.println("Pallindrome");

             }
             else 
             {
                System.out.println("Not pallindrome");
             }
     }
 }
