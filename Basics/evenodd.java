//package Basics;
import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Even-1, odd-2 and check-3 For_Prime-4");
        int m = sc.nextInt();

        switch (m) {

            case 1:
                System.out.println("Enter the nth number: ");
                int n = sc.nextInt();
                int result;
                for (int i = 1; i <= n; i++) {
                    result = i;
                    if (result % 2 == 0) {
                        System.out.println(result);
                    }
                }
                break;
            case 2:
                System.out.println("Enter the nth number: ");
                int nm = sc.nextInt();
                int result0;
                for (int i = 1; i <= nm; i++) {
                    result0 = i;
                    if (result0 % 2 != 0) {
                        System.out.println(result0);
                    }
                }
                break;
            case 3:
                System.out.println("Enter the nth number: ");
                int nmp = sc.nextInt();
                if (nmp % 2 == 0) {
                    System.out.println("Even ");
                } else {
                    System.out.println("Odd ");
                }
                break;
            case 4:
                System.out.println("Enter a number to check weather it is a Prime number or not");
                int np = sc.nextInt();
                if (np % 2 != 0 && np % 3 != 0) {
                    System.out.println("The number " + np + " is a prime number");
                } else {
                    System.out.println("The number " + np + " is not a prime number");
                }
                break;
            default:
                System.out.println("Please choose the right option!");
        }

    }
}