import java.util.Scanner;

public class EtruscanWarriorsNeverPlayChess {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    for (int i=0;i<n;i++) {
      Integer k = in.nextInt();
      System.out.printf("%.0f%n",Math.floor((-1 + Math.sqrt(1-(4*-2*k)))/2));
    }
  }
}
