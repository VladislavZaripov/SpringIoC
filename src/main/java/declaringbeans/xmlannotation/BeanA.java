package declaringbeans.xmlannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanA {

    String messageBeanA;

    @Autowired
    public BeanA(String messageBeanA) {
        this.messageBeanA = messageBeanA;
    }

    public void execute(){
        System.out.println("beanA - injection / bean / " + messageBeanA);
    }
}