package dev.markguiang.prac;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
  @Bean("first")
  public String first(@Qualifier("third") String third) {
   return "first"+third; 
  }

  @Bean("second")
  @Scope("prototype")

  public String second(@Qualifier("first") String first) {
    return first+"second" ;
  }
  @Bean("third")
  public String third(@Qualifier("second") String second) {
    return second+"third" ;
  }
}
