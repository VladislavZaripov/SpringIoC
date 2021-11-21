package lifecyclebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ComponentScan(basePackages = "lifecyclebeans")
@Configuration
public class ConfigurationClass {

    @Lazy
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanD beanD(){
        BeanD beanD = new BeanD();
        beanD.setName("text");
        beanD.setAge(5);
        return beanD;
    }

    public void execute(ApplicationContext actx){
        actx.getBean("beanD",BeanD.class);
    }

}