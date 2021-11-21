package declaringbeans.annotation;

import org.springframework.stereotype.Service;

@Service("beanA")
public class BeanA {

    public void execute(){
        System.out.println("beanA - declaration - @Service");
    }
}