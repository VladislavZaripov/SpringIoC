package declaringbeans.xmlannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XMLAnnotation {

    @Autowired
    BeanA beanA;

    @Autowired
    BeanB beanB;

    @Autowired
    BeanC beanC;

    @Autowired
    BeanD beanD;

    public void execute(){
        System.out.println("\n---Declaring Beans XMLAnnotation---");
        beanA.execute();
        beanB.execute();
        beanC.execute();
        beanD.execute();
    }
}