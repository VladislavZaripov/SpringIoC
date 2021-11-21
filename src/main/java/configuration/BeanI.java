package configuration;

import org.springframework.beans.factory.annotation.Value;

public class BeanI {

    @Value("${firstName}")
    private String firstName;

    @Value("${secondName}")
    private String secondName;

    public void execute(){
        System.out.println("BeanI - @PropertySource / " + firstName + " " + secondName);
    }
}