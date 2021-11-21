package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Profile("Main")
@ComponentScan(basePackages = "configuration")
@Configuration
@PropertySource("configuration/config.properties")
@Import(ConfigurationClassBeans.class)
public class ConfigurationClass {

    public void execute(ApplicationContext actx){
        BeanB beanB = actx.getBean("beanB", BeanB.class);
        beanB.execute();

        BeanI beanI = actx.getBean("beanI", BeanI.class);
        beanI.execute();

        BeanL beanL = actx.getBean("beanL", BeanL.class);
        beanL.execute();
    }
}