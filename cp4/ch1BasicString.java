import java.util.Scanner;
import java.lang.StringBuilder;
public class ch1BasicString {
  public static void main(String[] args) {
    var in = new Scanner(System.in);

    StringBuilder c = new StringBuilder();
    while(true) {
      String s = in.nextLine();
      if (s.length() >= 7 && s.substring(0,7).equals(".......")) {
        break;
      }
      c.append(" ").append(s);
    }
    System.out.println(c.toString().substring(1));
  }  
}
