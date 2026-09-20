import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNext()) {
      Integer v = in.nextInt();
      Integer t = in.nextInt();
      System.out.println(v*t*2);
    }
  } 
}
