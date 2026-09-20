import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class basicprogramming1 {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int t = in.nextInt();
    if (t==1) {
      System.out.print(7);
      return;
    }
    if (t==2) {
      int z = in.nextInt();
      int o = in.nextInt();

      if (z > o) {
        System.out.println("Bigger");
      } else if (z == o) {
        System.out.print("Equal");
      } else {
        System.out.print("Smaller");
      }
      return;
    }

    if (t==3) {
      int i = in.nextInt();
      int j = in.nextInt();
      int k = in.nextInt();
      List<Integer> l =Arrays.asList(i,j,k);
      l.sort((x,y) -> x.compareTo(y)); 
      System.out.print(l.get(1));
      return;
    }

    Long[] ar = new Long[n];
    for (int i=0;i<n;i++) {
      ar[i] = in.nextLong(); 
    }

    if (t==4) {
      System.out.print(Arrays.stream(ar).reduce(0L, (acc, x) -> acc+x));
      return;
    }
    if (t==5) {
     System.out.print(Arrays.stream(ar).reduce(0L, (acc, x) -> x%2 == 0 ? acc+x : acc)); 
     return;
    }
    if (t==6) {
     System.out.print(Arrays.stream(ar).map((x) -> x%26).map((x) -> String.valueOf((char)(x+'a'))).reduce((acc,x) -> acc+x).get());
     return;
    }
    if (t==7) {
      int i = 0;
      Set<Integer> v = new HashSet<>();
      while(true) {
        if (i>=n) {
          System.out.print("Out");
          return;
        }
        if (i == n-1) {
          System.out.print("Done");
          return;
        }
        if (v.contains(ar[i].intValue())) {
          System.out.print("Cyclic");
          return;
        }
        v.add(ar[i].intValue());
        i = ar[i].intValue();
      }            
    }
  }
}
