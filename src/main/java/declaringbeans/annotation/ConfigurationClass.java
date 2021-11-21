package declaringbeans.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "declaringbeans.annotation")
@Configuration
public class ConfigurationClass {

    @Bean
    public BeanForInjection beanForInjection(){
        BeanForInjection beanForInjection = new BeanForInjection();
        return beanForInjection;
    }

    @Bean
    public BeanC beanC(){
        BeanC beanC = new BeanC();
        return beanC;
    }

    @Bean
    public BeanD beanD(){
        BeanD beanD = new BeanD();
        beanD.setBeanForInjection(beanForInjection());
        return beanD;
    }

    @Bean(name = {"ID beanNamesConfigurationClass","second","third"})
    public BeanNamesConfigurationClass beanNamesConfigurationClass(){
        BeanNamesConfigurationClass beanNamesConfigurationClass = new BeanNamesConfigurationClass();
        return beanNamesConfigurationClass;
    }
}