import java.util.Scanner;
import java.util.stream.Stream;

public class SummingDigits {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    for(int i=in.nextInt();i!=0;i=in.nextInt()) {
      String curr = String.valueOf(i);
      while(curr.length() != 1) {
        curr = loop(curr);
      }
      System.out.println(curr);
    }
  }
  static String loop(String curr) {
    return String.valueOf(curr.chars().map(x->x-'0').reduce(0, (x,y)->x+y));
  }
}
