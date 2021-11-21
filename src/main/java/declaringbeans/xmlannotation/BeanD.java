package declaringbeans.xmlannotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("beanD")
public class BeanD {

    BeanForInjection beanForInjection;

    @Resource(name="beanForInjection")
    public void setBeanForInjection(BeanForInjection beanForInjection){
        this.beanForInjection = beanForInjection;
    }

    public void execute(){
        System.out.println("beanD - injection Bean - @Resource(name=\"beanForInjection\")");
    }
}