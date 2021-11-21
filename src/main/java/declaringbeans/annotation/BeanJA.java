package declaringbeans.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Primary
public class BeanJA implements BeanJ {

    public void execute(){
        System.out.println("BeanJA - @Primary & @Lazy");
    }
}