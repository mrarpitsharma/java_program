import java.util.*;
class Constructor1
 {
   public static void main(String args[])
    {
   int n;
   {
   Constructor1()
    {
      n = 0;
    }

   void input() 
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to check where the sum of its factor is equal to the number");
      n = sc.nextInt();
     }

   void check()
          {
             for(int i=1;i<=n;i++)
              {
                if(n%i==0)
                 {
                    i=i+(i+1);
                     if(i==n)
                      {
                        System.out.println("The sum of factors of the number is equal to the number");
                      }
                 }
                 else
                 System.out.println("The sum of the factor is not equal to the number");
           
              }
            }

     
   {    
   Contructor1 obj=new contructor1();
   obj.accept();
   obj.check();
   }
 }
}
 }