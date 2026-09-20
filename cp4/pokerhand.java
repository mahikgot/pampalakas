import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class pokerhand {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    Map<Character, Integer> r = new HashMap<>();

    while(in.hasNext()) { 
      String curr = in.next();
      r.compute(curr.charAt(0),(k,v) -> v == null ? 1 : v+1);
    }
    
    System.out.println(r.values().stream().max((x,y) -> x.compareTo(y)).get());
  }
}
