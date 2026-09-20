import java.util.Scanner;

public class bitsequalizer {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      String s = in.next();
      String t = in.next();

      int zeroToOne = 0;
      int oneToZero = 0;
      int qtoOne = 0;
      int qtoZero = 0;

      for (int j = 0; j < s.length(); j++) {
        char sC = s.charAt(j);
        char tC = t.charAt(j);

        if (sC == tC) {
          continue;
        }
        if (sC == '0' && tC == '1') {
          zeroToOne++;
          continue;
        }
        if (sC == '1' && tC == '0') {
          oneToZero++;
          continue;
        }
        if (sC == '?') {
          if (tC == '1') {
            qtoOne++;
            continue;
          }
          if (tC == '0') {
            qtoZero++;
          }
        }

      }
      int cnt = 0;
      cnt += Math.min(oneToZero, zeroToOne);
      if (oneToZero > zeroToOne) {
        oneToZero -= zeroToOne;
        zeroToOne = 0;
      } else {
        zeroToOne -= oneToZero;
        oneToZero = 0;
      }
      if (qtoOne < oneToZero) {
        System.out.printf("Case %d: %d%n", i + 1, -1);
        continue;
      }
      if (oneToZero > 0) {
        cnt += oneToZero * 2;
        qtoOne -=oneToZero;
      }
      cnt += qtoOne + qtoZero+zeroToOne;
      System.out.printf("Case %d: %d%n", i + 1, cnt);
    }
  }
}
