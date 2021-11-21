package declaringbeans.annotation;

import org.springframework.stereotype.Component;

@Component("beanB")
public class BeanB {

    public void execute(){
        System.out.println("beanB - declaration - @Component");
    }
}