public class StackHeapOverflowOOM {
  public static void main {
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
