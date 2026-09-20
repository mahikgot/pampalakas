import java.util.Scanner;

public class CharacterRecognition {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] res = new String[n];

    for (int i=0;i<5;i++) {
      String ln = in.next();
        for (int k=0;k<n;k++) {
          String curr = ln.substring(k*4, ((k+1)*4)-1);
          if (res[k] == null) {
            res[k] = curr;
          } else {
            res[k] += curr;
          }
        }
      }
      for (String s: res) {
        if (s.equals(".*..*..*..*..*.")) {
          System.out.print(1);
        } else if (s.equals("***..*****..***")) {
          System.out.print(2); 
        } else if (s.equals("***..****..****")) {
          System.out.print(3);  
        }
      }
    }
}
