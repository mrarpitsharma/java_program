//package Basics;
import java.util.*;

public class arpitSharma
 {
    public static void main(String[] args) {
        {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter two numbers");
             int n=sc.nextInt();
             int m=sc.nextInt();
             System.out.println("Enter choice 1.for addition, 2.for multiplication");
             int c=sc.nextInt();
             int k;
             switch(c){
                case 1:
                    k=n+m;
                    System.out.println(k);
                    break;
                 case 2:
                    k=n*m;
                    System.out.println(k);
                    break;
                 default:
                    System.out.println("Invalid Data");
             }
         }  
        }
    }
