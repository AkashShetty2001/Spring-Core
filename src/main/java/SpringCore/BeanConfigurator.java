package SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "SpringCore")
public class BeanConfigurator {

    @Bean
    public String carName(){
        return "BMW";
    }

    @Bean
    public String engineName(){
        return "Ford";
    }
}
