package configuration;

import org.springframework.context.ApplicationEvent;

public class BeanG_Event extends ApplicationEvent {

    private String msg;

    public BeanG_Event(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}