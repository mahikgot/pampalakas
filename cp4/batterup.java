import java.util.Scanner;

public class batterup {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    float sum = 0;
    float cnt = 0;
    for (int i=0;i<n;i++) {
      int j = in.nextInt();
      if (j != -1) {
        cnt++;
        sum += j;
      }
    }

    System.out.print(sum/cnt);
  }
}
