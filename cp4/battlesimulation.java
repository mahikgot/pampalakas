import java.util.Scanner;

public class battlesimulation {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);

    String x = in.next();

    for (int i = 0; i < x.length(); i++) {
      if (i <= x.length() - 3) {
        char j = x.charAt(i);
        char k = x.charAt(i + 1);
        char l = x.charAt(i + 2);

        if (j != k && j != l && k != l) {
          System.out.print('C');
          i += 2;
          continue;
        }
      }
      char r = switch (x.charAt(i)) {
        case 'R' -> 'S';
        case 'B' -> 'K';
        case 'L' -> 'H';
        default -> 'x';
      };
      System.out.print(r);
    }
  }
}
