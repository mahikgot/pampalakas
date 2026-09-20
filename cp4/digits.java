import java.util.Scanner;

public class digits {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    String c = in.nextLine().strip();
    
    while (!c.equals("END")) {
      if (c.length() == 1 && Integer.valueOf(c) == 1) {
        System.out.println(1);
      } else {
        int x1 = c.length();
        System.out.println(minn(x1, 1));
      }
      c = in.nextLine().strip();
    }
    return;
  }

  static int minn(Integer x0, Integer i) {
    int x1 = String.valueOf(x0).length();
    if (x1 == x0) {
      return i+1;
    }
    return minn(x1, i+1);
  }
}
