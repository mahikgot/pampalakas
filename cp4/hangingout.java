import java.util.Scanner;

public class hangingout {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);

    int l = in.nextInt();
    int x = in.nextInt();

    int curr = 0;
    int cnt = 0;
    for (int i=0;i<x;i++) {
      if (in.next().equals("enter")) {
        int y = in.nextInt();
        if (y+curr > l) {
          cnt++;
        } else {
          curr +=y;
        }
      } else {
        int y = in.nextInt();
        curr -= y;
      }
    }
    System.out.print(cnt);
  }
}
