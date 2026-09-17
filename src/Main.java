package dev.markguiang.prac;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
    var app = new AnnotationConfigApplicationContext();
    app.scan("dev.markguiang.prac");
    app.refresh();
    var test = app.getBean(String.class);
    System.out.println(test);
  }
}
