import java.util.Scanner;
import java.lang.StringBuilder;
public class filip {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    var left = new StringBuilder(in.next()).reverse().toString();
    var right = new StringBuilder(in.next()).reverse().toString();
    if (left.compareTo(right) < 0) {
      System.out.print(right);
    } else {
      System.out.print(left);
    }
  }
}
