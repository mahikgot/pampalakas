import java.util.Arrays;
import java.util.Scanner;

public class PolePosition {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);

    while(in.hasNext()) {
      int n = in.nextInt();

      boolean b = true;
      int[] m = new int[n];
      for (int i=0;i<n;i++) {
        int c = in.nextInt();
        int p = in.nextInt();

        int cp = i + p;
        if (cp < 0 || cp >= m.length || m[cp] > 0) {
          b = false;          
          i++;
          for (int j=0;j<n-i;j++) {
            in.nextInt();
            in.nextInt();
          }
          break;
        }
        m[cp] = c;
      }
      if (!b) {
        System.out.println(-1);
      } else {
        for (int i=0;i<m.length;i++) {
          if (i < m.length-1) {
            System.out.printf("%d ", m[i]);
          } else {
            System.out.print(m[i]);
          }
        }
        if (n != 0) {
          System.out.println();
        }
      }
    }

  }
}
