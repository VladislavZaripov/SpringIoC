package configuration;

import org.springframework.context.ApplicationListener;

public class BeanG_EventListener implements ApplicationListener <BeanG_Event> {

    @Override
    public void onApplicationEvent(BeanG_Event beanG_event) {

        System.out.print(" / Received: " + beanG_event.getMsg());

    }
}