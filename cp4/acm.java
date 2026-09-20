import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class acm {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    Map<String, Integer> m = new HashMap<>();
    int rights = 0;
    int score = 0;
    while(true) {
      int time = in.nextInt();
      if (time == -1) {
        System.out.printf("%d %d", rights, score);
        return;
      }
      String problem = in.next();
      boolean right = in.next().equals("right");

      if (right) {
        if (m.containsKey(problem)) {
          score += m.get(problem)*20;
        }
        score += time;
        rights++;
      } else {
        m.compute(problem, (k,v) -> (v==null) ? 1 : v+1);
      }
    }
  }
}
