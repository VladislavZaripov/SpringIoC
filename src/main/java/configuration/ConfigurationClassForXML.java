package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClassForXML {

    @Bean
    public BeanK beanK (){
        BeanK beanK = new BeanK();
        return beanK;
    }
}