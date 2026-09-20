import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class jollyjumpers {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String[] l = in.nextLine().split(" ");
      int n = Integer.valueOf(l[0]);
      Set<Integer> mem = new HashSet<>();

      boolean j = true;
      int first = Integer.valueOf(l[1]);
      for (int i = 2; i < n+1; i++) {
        int curr = Integer.valueOf(l[i]);

        int abs  = Math.abs(curr-first); 
        if ( abs < 1 || abs > n-1) {
         j = false;
         break;
        }
        boolean neww = mem.add(abs);
        if (!neww) {
          j = false;
          break; 
        }
        first = curr;
      }
      if (j) {
        System.out.println("Jolly");
      } else {
        System.out.println("Not Jolly"); 
      }
    }
  }
}
