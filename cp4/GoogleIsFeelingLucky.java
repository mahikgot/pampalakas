import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GoogleIsFeelingLucky {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    for (int i=0;i<n;i++) {
      Map<Integer, List<String>> m = new HashMap<>();
      for (int j=0;j<10;j++) {
        String c = in.next();
        int r = in.nextInt();

        if (m.keySet().contains(r)) {
          m.get(r).add(c);
          continue;
        }
        m.put(r, new ArrayList<String>(Arrays.asList(c)));
      }
      System.out.printf("Case #%d:%n", i+1);
      int maxKey = m.keySet().stream().max((x,y) -> x.compareTo(y)).get();
      for (String s: m.get(maxKey)) {
        System.out.println(s);
      }
    }
  }
}
