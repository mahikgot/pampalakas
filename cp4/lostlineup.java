import java.util.Scanner;

public class lostlineup {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    var n = in.nextInt();
    int[] res = new int[n];
    res[0] = 1;

    for (int i=1;i<n;i++) {
      var c = in.nextInt();
      res[c+1] = i+1;
    }
    for (int i=0;i<n-1;i++) {
      System.out.printf("%d ", res[i]);
    }
    System.out.print(res[n-1]);
  }
}
