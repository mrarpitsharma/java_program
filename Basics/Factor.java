//package Basics;
import java.util.*;
class Factor
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to see its factor");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
         {
            if(n%i==0)
             {
               System.out.println(i);
             }  
         }
 }
}