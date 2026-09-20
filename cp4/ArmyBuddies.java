import java.util.Scanner;

public class ArmyBuddies {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int s = in.nextInt();
      int b = in.nextInt();

      int[] mem = new int[s];
      for (int i=0;i<b;i++) {
        int l = in.nextInt()-1;
        int r = in.nextInt()-1;
        
        for (int j=l;j<r;j++) {
          mem[j] = -1;
        }
        
      }
    }
  }
}
