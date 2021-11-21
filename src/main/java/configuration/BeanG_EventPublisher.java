package configuration;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanG_EventPublisher implements ApplicationContextAware {

    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    private void publish(String message){
        ctx.publishEvent(new BeanG_Event(this, message));
    }

    public void execute(){
        System.out.print("BeanG_EventPublisher");
        publish("message 1");
        publish("message 2");
        publish("message 3");
        System.out.println();
    }
}