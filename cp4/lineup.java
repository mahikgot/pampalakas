import java.util.Scanner;

public class lineup {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    String f = in.next();
    String s = in.next();

    int comp = f.compareTo(s);
    for (int i=2;i<n;i++) {
      String c = in.next();
      int compN = s.compareTo(c);
      s = c;

      if ((compN < 0 && comp < 0) || (compN > 0 && comp > 0) || (compN == comp)) {
        continue;
      } else {
        System.out.println("NEITHER");
        return;
      }
    }
    if (comp > 0) {
      System.out.println("DECREASING");
      return;
    } else if (comp < 0) {
      System.out.println("INCREASING");
       return; 
    } else {
      System.out.println("NEITHER");
    }
  }
}
