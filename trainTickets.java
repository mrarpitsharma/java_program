import java.util.*;
class trainTickets
 {
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String s1="GAYA";
      String s2="HWH";
      System.out.println("                                 WELCOME TO INDIAN RAILWAYS TRAIN TICKETS APP.");
    //  System.out.println("                                                                      -PROGRAMMED BT ARPIT");
      System.out.println("PRESS 'ENTER' TO ENTER THE APP");
      String sp=sc.nextLine();

      if(sp=="")
       {
         // System.out.println("if checking");
         System.out.println("PRESS '1' FOR EXPRESS TRAIN TICKETS,  '2'. FOR LOCAL TRAIN TICKETS");
         int el=sc.nextInt();
         if(el==1) //Express train ticket
          {
             System.out.println("ENTER- FROM WHICH STATION YOU WANT TRAIN (Station code only)");
             String From=sc.next();
             System.out.println("ENTER- TO WHICH STATATION YOU WANT TO GO (Station code only)");
            //  String To=sc.next();
             switch(From)
              {
               case "HWH":
                {
                  // System.out.println("ENTER- TO WHICH STATATION YOU WANT TO GO (Station code only)");
                   String To=sc.next();
                  if(To==s1)
                   {
                      System.out.println("ENTER DATE:-(select n.o)");
                      System.out.println("1.ALL DATES, 2.TODAY, 3. TOMORROW,  4. CHOOSE FROM CALENDER");
                      int dt=sc.nextInt();
                      if(dt==1)
                       {
                        System.out.println("SELECT FAIRS:-");
                        System.out.println("1.  GN-UNRESERVED");
                        System.out.println("2.  SL-SLEEPER");
                        System.out.println("3.  3A-AC 3-TIER");
                        System.out.println("4.  2A-AC-2-TIER");
                        System.out.println("5.  1A - FIRST CLASS AC");
                        System.out.println("6.  CC - AC CHAIR CAR");
                        System.out.println("7.  EC - EXECUTIVE CHAIR CAR");
                        System.out.println("8.  EA - EXECUTIVE ANUBHUTI");
                        System.out.println("9.  2S - SECOND SITTING");
                        System.out.println("10. FC - FIRST CLASSS");
                        System.out.println("HWH - HOWRAH JUNCTION TO GAYA - GAYA JUNCTION");
                        String n="";
                        int f=sc.nextInt();
                        if (f==1)
                         {
                            n="NA";
                         }
                        System.out.println("22303 6:50AM -> 12:30 PM "+n);
                        System.out.println("GAYA VANDE BHARAT EXPRESS  SUN,MON,TUE,WED,FRI,SAT");
                        System.out.println("12381 8:15AM -> 2:43PM");
                       }
                   }
                }
              }
          }
          else if(el==2)
           {

           }
           else
           System.out.println("YOU HAVE PRESSED NOT 1 NOR 2");
       }
    }
 }