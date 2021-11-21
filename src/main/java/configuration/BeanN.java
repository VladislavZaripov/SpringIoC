package configuration;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanN {

    public void execute(GenericXmlApplicationContext gctx){

        BeanN_Property beanN_property = gctx.getBean("beanN_Property", BeanN_Property.class);

        System.out.print("BeanN - config.properties + local-override=\"true\" / ");

        System.out.print("System.getProperty(\"user.home\"): " + System.getProperty("user.home") + " / ");

        System.out.println("property XML: " + beanN_property.getUserHome());
    }
}