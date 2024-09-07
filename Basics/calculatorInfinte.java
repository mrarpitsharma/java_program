//package Basics;
import java.util.*;
public class calculatorInfinte
 {
    public static void main(String args[])
     {
       Scanner sc=new Scanner (System.in);
       System.out.println("Welcome to Arpit' Calculator... ");
       System.out.println("Enter size of your elemets");
       //System.out.println("If you dont know the size you can calculate it here");
       int s=sc.nextInt();
       int op;
       System.out.println("Now enter numbers and funcions after each and use!!!"); 
       int x[]=new int[s];
       char c=sc.next().charAt(0);
       for (int i=1;i<=s;i++)
        {
          if(s=='+');
           {
             Op=x.charAt(i)+char s.At(i+1);
           }
          else if(s=='-')
           {
             op=x.chatAt(i)- x.charAt(i++);
           }
          else if(s=='/')
           {
             op=x.charAt(i)/x.charAt(i+1);
           }
          else if(s=='*')
           {
             op=x.charAt(i)*x.charAt(i+1);         
           }
        }
     }
 }