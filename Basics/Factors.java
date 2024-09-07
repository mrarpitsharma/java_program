//check wheter the sum of factors of a number is equal to the number or not.
import java.util.*;
class Factors
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to see its factor");
        int n=sc.nextInt();
        int k;
        System.out.println("Its Factors are:-");
        for(int i=1;i<=n;i++)
         {
            if(n%i==0)
            k=i;
             {
                for(int j=i;j<=i;j++)
                if(j==n)
                System.out.println("The sum of its factor is equal to the number");
                else
                System.out.println("Not equal");
             }
         }
     }
 }