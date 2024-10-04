import java.util.*;

class rockpaperScissor {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER ROUNDS");
    int r = sc.nextInt();
    int cp=0,pp=0;
    String cc = "";
    //System.out.println("ROCK PAPER OR SCISSOR");
    for (int i = 0; i <= r; i++) {
      System.out.println("ROCK PAPER OR SCISSOR");
      String s = sc.nextLine();
      s = s.toUpperCase();
      Random randomNum = new Random();
      int c = randomNum.nextInt(2);
      
      if (c == 0) {
        cc = "ROCK";
      } else if (c == 1) {
        cc = "PAPER";
      } else if (c == 2) {
        cc = "SCISSOR";
      }
      //System.out.println(cc); //computer

      switch(s)
       {
        case "ROCK":
         {
          if(cc=="ROCK")
           {
            System.out.println("TIE");
            System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
           }
           else if(cc=="PAPER")
            {
              System.out.println("COMPUTER WINS");
              cp++;
              System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
            }
            else if(cc=="SCISSOR")
             {
              System.out.println("YOU WIN");
              pp++;
              System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
             }
         }
         break;
         case "SCISSOR":
          {
            if(cc=="SCISSOR")
             {
              System.out.println("TIE");
              System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
             }
             else if(cc=="PAPER")
              {
                System.out.println("YOU WIN");
                pp++;
                System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
              }         
              else if(cc=="ROCK")
               {
                System.out.println("COMPUTER WINS");
                cp++;
                System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
               }
            }
            break;
            case "PAPER":
             {
              if(cc=="SCISSOR")
              {
               System.out.println("COMPUTER WINS");
               cp++;
               System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
              }
              else if(cc=="PAPER")
               {
                 System.out.println("TIE");
                 System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
               }         
               else if(cc=="ROCK")
                {
                 System.out.println("YOU WIN");
                 pp++;
                 System.out.println("SCORE : YOU-> "+pp+ " COMPUTER-> " +cp);
                }
             }
             break;
            //  default:
            //  System.out.println("ERROR IN YOUR SPELLING!!!");
       }

      }
    }
  }
  

      // A COMPLICATED METHOD:-
      // if (s == cc) {
      //   System.out.println("TIE");
      // } else if (s == "ROCK" && cc == "PAPER") {
      //   System.out.println("COMPUTER WINS");
      // } else if (s == "ROCK" && cc == "SCISSOR") {
      //   System.out.println("YOU WIN");
      // }

      // else if (s == "SCISSOR" && cc == "ROCK") {
      //   System.out.println("COMPUTER WINS");
      // } else if (s == "SCISSOR " && cc == "PAPER") {
      //   System.out.println("YOU WIN");