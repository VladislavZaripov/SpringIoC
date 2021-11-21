package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = "configuration/configurationForClassBeans.xml")
public class ConfigurationClassBeans {

    @Bean
    public BeanB_Factory beanBFactory (){
        BeanB_Factory beanBFactory = new BeanB_Factory();
        beanBFactory.setProperties("ConfigurationClass");
        return beanBFactory;
    }

    @Bean
    public BeanB beanB () throws Exception{
        BeanB beanB = beanBFactory().getObject();
        return beanB;
    }

    @Bean
    public BeanI beanI () throws Exception{
        BeanI beanI = new BeanI();
        return beanI;
    }
}