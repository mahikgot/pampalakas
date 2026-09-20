import java.util.Scanner;

public class score {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i=0;i<n;i++) {
      String s = in.next();
      int cnt = 0;
      int consecs = 0;
      for (int j=0;j<s.length();j++) {
        char c = s.charAt(j);
        if (c == 'X') {
          consecs = 0;
          continue;
        }
        cnt += 1+consecs;
        consecs++;
      }
      System.out.println(cnt);
    }
  }
}
