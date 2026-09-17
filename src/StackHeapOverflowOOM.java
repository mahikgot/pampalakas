import java.util.ArrayList;

public class StackHeapOverflowOOM {
  public static void main(String[] args) {
    try {
      heapOOM();
      //stackOverflow();
    } catch (OutOfMemoryError e) {
      System.out.println(i);
    }
  }

  static int i =0;
  static void stackOverflow() {
    stackOverflow();
  }
  static void heapOOM() {
    var l = new ArrayList<Integer>();
    while (true) {
     l.add(i++); 
    }
  }
}
