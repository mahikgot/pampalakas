import java.util.Scanner;
import java.util.stream.Stream;

public class moscowdream {
  public static void main(String[] args) {
    var in = new Scanner(System.in);
    String[] inp = in.nextLine().split(" ");
    var intInp = Stream.of(inp).mapToInt(x -> Integer.valueOf(x)).toArray();
    if (intInp[0] <= 0 || intInp[1] <= 0 || intInp[2] <= 0 || intInp[0]+intInp[1]+intInp[2] < intInp[3] || intInp[3] < 3) {
      System.out.print("NO");
      return;
    }
    System.out.print("YES");
  }
}
