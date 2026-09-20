import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class artichoke {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    String[] inln = in.nextLine().split(" ");
    int[] ln = Stream.of(inln).mapToInt(x -> Integer.parseInt(x)).toArray();
    int p = ln[5];
    Function<Integer,Double> func = (k) -> ln[0]*(Math.sin(ln[1]*k+ln[2])+Math.cos(ln[3]*k+ln[4]) +2);

    double maxx = func.apply(1);
    double diff = 0;
    for (int i=2;i<=p;i++) {
      diff = Math.max(diff, maxx - func.apply(i));
      maxx = Math.max(maxx, func.apply(i));
    }
    System.out.println(diff);
  }

}
