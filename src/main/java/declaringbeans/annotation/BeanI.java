package declaringbeans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("beanForInjection")
public class BeanI {

    public void execute(ApplicationContext ctx){
        System.out.print("BeanI - depends-on");
        BeanForInjection beanForInjection = ctx.getBean("beanForInjection", BeanForInjection.class);
        beanForInjection.execute();
    }
}