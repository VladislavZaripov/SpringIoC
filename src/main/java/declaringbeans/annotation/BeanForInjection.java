package declaringbeans.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeBeanForInjection")
@Scope("prototype")
//@Scope("singleton") - by default
public class BeanForInjection {

    public String string = "text";
    public Integer integer = 5;

    public void execute(){
        System.out.println(" / BeanForInjection is injected");
    }
}