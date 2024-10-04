import java.util.*;

class atm {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int slot = 1;
      System.out.println("PLEASE INSERT YOUR ATM CARD");
      if (slot == 1) {
         System.out.println("PLEASE ENTER YOUR PIN");
         double pin = sc.nextInt();
         if (pin == 7777) {
            System.out.println("1:BALANCE INQUIRY.      5:FAST CASH.");
            System.out.println("2:MINI STATEMENT.       6:CASH WITHDRAWAL.");
            System.out.println("3:SERVICES.             7:PIN CHANGE.");
            System.out.println("4:BILL PAYMENTS.        8:FUNDS TRANSFER");
            // System.out.println("1:BALANCE INQUIRY. 2:MINI STATEMENT. 3:SERVICES. 4:BILL
            // PAYMENTS");
            // System.out.println("5:FAST CASH. 6:CASH WITHDRAWAL. 7:PIN CHANGE. 8:FUNDS
            // TRANSFER");
            int ch = sc.nextInt();
            switch (ch) {
               case 1: {

                  System.out.println("This feature will be avaliable soon!!!");

               }
                  break;
               case 2: {

                  System.out.println("This feature will be avaliable soon!!!");

               }
                  break;
               case 3: {
                  System.out.println("This feature will be avaliable soon!!!");
               }
                  break;
               case 4: {
                  System.out.println("This feature will be avaliable soon!!!");
               }
                  break;
               case 5: {
                  System.out.println("This feature will be avaliable soon!!!");

               }
                  break;
               case 6: {
                  System.out.println("1:KYC.  2:CURRENT  3:SAVINGS.");
                  int op = sc.nextInt();

                  if (op == 1) {

                  } else if (op == 2) {

                  }

                  else if (op == 3) {
                  }
                  System.out.println("PLEASE ENTER AMOUNT");
                  int no = 0;
                  double amt = sc.nextInt();

                  if (amt > 99 && amt <= 50000) {

                     // if(amt>=1000 && amt<=10000 && amt%100==0 && amt%500==0)
                     // {
                     // System.out.println("DO YOU WANT (1.)'100' RUPESS NOTE OR (2.)'500' RUPESS
                     // NOTE");
                     // int note=sc.nextInt();
                     // if(note==1)
                     // {
                     // for(int i=1;i<=amt;i++)
                     // {
                     // if(amt%i==0)
                     // no++;
                     // System.out.println(no);
                     // }
                     // }
                     // }
                     System.out.println("TRANSACTION PROCESSING....");
                     if (amt % 100 == 0) {

                        System.out.println("PLEASE TAKE YOUR MONEY  " + amt);
                     } else if (amt % 100 != 0)
                        System.out.println(
                              "TRANSACTION UNAVLABLE BECAUSE THE ATM HAS ONLY 100 AND 500s NOTE SO WE CANT GIVE THAT AMOUNT");
                  }

                  else if (amt < 100)
                     System.out.println("TRANSACTION UNAVALABLE LESS THAN 100 RUPESS");
                  else if (amt > 50000)
                     System.out.println("TRANSACTION UNAVALABLE MORE THAN 50000 RUPESS");

               }

                  break;
               case 7: {
                  System.out.println("PLEASE ENTER YOUR OLD PIN TO CHANGE THE PIN");
                  int c = sc.nextInt();
                  if (c == pin) {
                     System.out.println("ENTER YOUR NEW PIN");
                     int np = sc.nextInt();
                     System.out.println("YOUR NEW PIN HAS BEEN SUCSESSFULLY UPDATED");

                  }
               }
                  break;
               case 8: {
                  System.out.println("This feature will be avaliable soon!!!");
               }
                  break;
            }
         } else
            System.out.println("INVALID PIN");
      }

   }
}