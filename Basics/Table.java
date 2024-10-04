
//10.9.2024  - arpit
import java.util.*;

class Table
 {
    public static void main(String args[]) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of which you want to see multiple of...");
        int to = sc.nextInt();
        if (to >= 0)
            System.out.println("Your number is " + to + " if it is mistyped then rerun the Program");
        System.out.println("Now enter upto where you want to see the table ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
         {
            int k = to * i;
            System.out.println(to + "X" + i + "=" + k);
            // System.out.println(k);
         }
     }
 }