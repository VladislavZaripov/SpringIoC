package declaringbeans.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanF")
public class BeanF {

    @Value("text")
    String string;
    @Value("5")
    Integer integer;
    @Value("true")
    Boolean aBoolean;

    public void execute(){
        System.out.println("BeanF - injection in field / " + string + " & " + integer + " & " + aBoolean+ " are injected");
    }
}