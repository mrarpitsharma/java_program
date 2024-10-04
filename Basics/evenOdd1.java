import java.util.*;
class evenOdd1
 {
     public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter choice 1.for check even or odd number    2. for see even or odd number");
          int choice=sc.nextInt();
          switch(choice)
           {
               case 1:
                    {
                        System.out.println("Enter a number to check weather it is even or odd");
                        int n=sc.nextInt();
                        if(n%2==0)
                        System.out.println("Even");
                        else
                        System.out.println("odd");
                        break;
                    }
                    case 2:
                        {
                            System.out.println("Enter choice 1. to see even numbers to nth    2. to see odd numbers upto nth n.o");
                            int n=sc.nextInt();
                            if(n==1)
                             {
                                 System.out.println("Enter the nth number upto where the loop will go");
                                 int nm=sc.nextInt();
                                 for(int i=1;i<=nm;i++)
                                  {
                                      if(i%2==0)
                                      System.out.println(i);
                                      
                                  }
                                  
                             }
                            else if(n==2)
                             {
                                 System.out.println("Enter the nth number upto where the loop will go");
                                 int nm=sc.nextInt();
                                 for(int i=1;i<=nm;i++)
                                  {
                                      if(i%2!=0)
                                      System.out.println(i);
                                  }
                             }
                        }
                        default:
                        System.out.println("Invalid Choice");
           }
      }
 }