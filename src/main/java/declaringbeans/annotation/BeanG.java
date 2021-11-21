package declaringbeans.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanG")
public class BeanG {

    @Value("#{beanForInjection.string}")
    String string;
    @Value("#{beanForInjection.integer + 5}")
    Integer integer;


    public void execute(){
        System.out.println("BeanG - SPeL injection / " + string + " & " + integer + " are injected");
    }
}