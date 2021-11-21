package declaringbeans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("beanH")
public class BeanH {

    @Autowired
    BeanForInjection beanForInjection;

    @Lookup("prototypeBeanForInjection")
    public BeanForInjection getPrototypeBeanForInjection(){
        return null;    // automatic replace return on bean
    }

    public void execute(){
        System.out.print("BeanH - injection @Lookup");
        System.out.print("/ setter: " + beanForInjection.equals(beanForInjection));
        System.out.println(" / LookUp method: " + getPrototypeBeanForInjection().equals(getPrototypeBeanForInjection()));
    }
}