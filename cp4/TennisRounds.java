import java.util.Scanner;

public class TennisRounds {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int n = in.nextInt();
      Double i = in.nextDouble();
      Double j = in.nextDouble();

      int cnt = 0;
      while (true) {
        i = Math.ceil(i / 2);
        j = Math.ceil(j / 2);
        cnt++;
        if (i.equals(j)) {
          System.out.println(cnt);
          break;
        }
      }
    }
  }
}
