import java.util.Scanner;

public class OpenCreditSystem {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i=0;i<t;i++) {
      int n = in.nextInt();
      int maxx = Integer.MIN_VALUE+150000;
      int diff = Integer.MIN_VALUE;
      for (int j=0;j<n;j++) {
        int curr = in.nextInt();
        diff = Math.max(diff, maxx - curr);
        maxx = Math.max(maxx, curr);
      }
      System.out.println(diff);
    }
  }
}
