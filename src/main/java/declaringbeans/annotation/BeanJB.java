package declaringbeans.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanJB implements BeanJ {

    public void execute(){
        System.out.println("BeanJB - @Lazy");
    }
}