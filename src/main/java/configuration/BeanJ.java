package configuration;

import org.springframework.beans.factory.annotation.Value;

public class BeanJ {

    @Value("${firstName}")
    private String firstName;

    @Value("${secondName}")
    private String secondName;

    public void execute(){

        System.out.println("BeanJ - XML property-placeholder / " + firstName + " " + secondName);
    }
}