import java.util.Scanner;

public class TariffPlan {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    for (int i=0;i<t;i++) {
      int n = in.nextInt();
      int mileC = 0;
      int juiceC =0;
      for (int j=0;j<n;j++) {
        Double x = in.nextDouble();
        mileC+=(Math.ceil(Math.clamp((x + 1)/30, 1, Integer.MAX_VALUE)))*10;
        juiceC+=(Math.ceil(Math.clamp((x + 1)/60, 1, Integer.MAX_VALUE)))*15;
      }
      System.out.printf("Case %d: ", i+1);
      if (mileC<juiceC) {
        System.out.printf("Mile %d%n", mileC);
      } else if (mileC>juiceC) {
       System.out.printf("Juice %d%n", juiceC); 
      } else {
        System.out.printf("Mile Juice %d%n", juiceC); 
      }
    }
  }
}
