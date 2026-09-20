import java.util.Scanner;

public class hissingmicrophone {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    String inp = in.next();

    boolean past = false;
    for (char c: inp.toCharArray()) {
      if (c == 's' && past) {
        System.out.println("hiss");
        return;
      }
      if (c == 's') {
        past = true;
      } else {
        past = false;
      }
    }
    System.out.println("no hiss");
  }
}
