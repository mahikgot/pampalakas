import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

class Main {
  static class Solution <T,R>{
    public final Function<? super T, ? extends R> mapper;
    public final String format;

    public Solution(Function<T, R> mapper, String format) {
      this.mapper = mapper; 
      this.format = format;
    }
  }

  static <R> void execEach(BufferedReader in, Solution<String,R> soln) {
    in.lines().map(soln.mapper).forEach(x -> System.out.printf(soln.format, x));
  }

  public static void main(String[] args) {
    var in = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

    var one = new Solution<String, Double>(x -> Double.valueOf(x), "%8.3f%n");
    var two = new Solution<String, String>(x -> String.format(String.format("%%.%sf", x), Math.PI), "%s%n");
    exec(in, two);
  }  
}

