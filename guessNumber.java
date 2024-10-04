import java.util.*;

class guessNumber {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      // int X[]=new int[100];
      int mov=0;
      Random randomNum = new Random();
      int sm = randomNum.nextInt(100);
      // System.out.println(sm);
      System.out.println("Guess The Generated number");
      //int n = sc.nextInt();
      int k = 1;
      for (int i = 1; i <= k; i++) {
         int n = sc.nextInt();
         if (n < sm) {
            mov++;
            System.out.println("Guess Larger Number!!" +"    Move:-"+mov);
            k++;
            //mov++;
           // System.out.println("                           Move:-"+mov);
            //System.out.println("Your Total Mobves-"+mov);
            // break;
         } else if (n > sm) {
            mov++;
            System.out.println("Guess Smaler Number!!"+"     Move:-"+mov);
            k++;
            //mov++;
           // System.out.println("                           Move:-"+mov);
            // break;
         } else if (n == sm) {
            System.out.println("Correct Guess ,,,Gajab!!!");
            mov++;
            
            System.out.println("Your Total Moves-"+mov);
            // break;
         }
      }
   }
}