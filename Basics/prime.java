//package Basics;
import java.util.*;
class prime
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check weather it is a Prime number or not");
        int n=sc.nextInt();
        if(n%2!=0 && n%3!=0)
         {
            System.out.println("The number " +n+ " is a prime number");
         }
        else 
         {
            System.out.println("The number " +n+ " is not a prime number");
         }
         
     }
 }