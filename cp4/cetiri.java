import java.util.Scanner;
import java.util.stream.Stream;
import java.util.List;

public class cetiri {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    List<Integer> s = Stream.of(in.nextLine().split(" ")).map(Integer::parseInt).sorted().toList();

    int d1 = s.get(1)-s.get(0);
    int d2 = s.get(2)-s.get(1);

    if (d1 == d2) {
      System.out.println(s.get(2)+d1);
      return;
    } else if (d1 < d2) {
      System.out.println(s.get(1) + Math.min(d1,d2));
      return;
    } else {
     System.out.println(s.get(0) + Math.min(d1,d2)); 
    }
  }
}
