package lifecyclebeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanE implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BeanE - ApplicationContextAware interface / registerShutdownHook");
        if(applicationContext instanceof GenericXmlApplicationContext)
            ((GenericXmlApplicationContext)applicationContext).registerShutdownHook();
    }

    public void execute(){
    }
}