import java.util.Scanner;
import java.util.stream.Stream;

public class mia {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    
    while (true) {
      String[] ins = in.nextLine().split(" ");
      int[] inss = Stream.of(ins).mapToInt(x -> Integer.parseInt(x)).toArray();

      int r1 = inss[0];
      int r2 = inss[1];
      int s1 = inss[2];
      int s2 = inss[3];

      if (r1 == 0 && r2 == 0 && s1 == 00 & s2 == 0) {
        return; 
      }
      if (isMia(r1,r2) && isMia(s1,s2)) {
       System.out.println("Tie."); 
      } else if (isMia(r1,r2)) {
       System.out.println("Player 1 wins.");  
      } else if (isMia(s1,s2)) {
       System.out.println("Player 2 wins.");   
      } else if (r1 == r2 && s1 == s2) {
        if (r1 == s1) {
         System.out.println("Tie.");  
        } else if (r1 > s1){
         System.out.println("Player 1 wins.");   
        } else {
         System.out.println("Player 2 wins.");    
        }
      } else if (r1 == r2) {
       System.out.println("Player 1 wins.");   
      } else if (s1 == s2) {
       System.out.println("Player 2 wins.");    
      } else {
        int rVal;
        int sVal;
        if (r1 > r2) {
          rVal = r1*10 + r2;
        } else {
          rVal = r2*10 + r1;
        }
        if (s1 > s2) {
          sVal = s1*10 + s2;
        } else {
          sVal = s2*10 + s1;
        }
        if (rVal == sVal) {
          System.out.println("Tie.");            
        } else if (rVal > sVal) {
          System.out.println("Player 1 wins.");             
        } else {
           System.out.println("Player 2 wins.");              
        }
      }
    }
  }
  static boolean isMia(int x, int y) {
    if ((x == 1 && y == 2) || (x == 2 && y == 1)) return true;
    return false;
  }
}
