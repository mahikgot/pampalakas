import java.util.Scanner;

public class carrots {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    in.nextInt();
    int car = in.nextInt();
    if (car >= 0) {
      System.out.print(car);
      return;
    }
    System.out.print(0);
  }
}
