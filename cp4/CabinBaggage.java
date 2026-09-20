import java.util.Scanner;

public class CabinBaggage {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int c=  0;
    for (int i=0;i<n;i++) {
      Float l = in.nextFloat();
      Float w = in.nextFloat();
      Float d = in.nextFloat();
      Float kg = in.nextFloat();
      if (isAllowed(l,w,d,kg)) {
        System.out.println("1");
        c++;
      } else {
        System.out.println("0");    
      }
    }
    System.out.print(c);
  }

  static boolean isAllowed(Float l, Float w, Float d, Float kg) {
    int MAX_L = 56;
    int MAX_W = 45;
    int MAX_D = 25; 
    int MAX_P = 125;
    int MAX_KG = 7;
    
    if (kg > MAX_KG) {
      return false;
    }
    if (l+w+d > MAX_P && (l > MAX_L || w > MAX_W || d > MAX_D)) {
      return false; 
    }
    return true;
  }
}
