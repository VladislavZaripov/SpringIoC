package configuration;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

public class BeanM {


    public void execute(GenericXmlApplicationContext gctx){

        ConfigurableEnvironment env = gctx.getEnvironment();

        MutablePropertySources mps = env.getPropertySources();

        Map<String, Object> map = new HashMap<>();
        map.put("user.home", "override.property");

        mps.addFirst(new MapPropertySource("ProSpring",map));

        System.out.print("BeanM - MutablePropertySources + addFirst / ");

        System.out.print("System.getProperty(\"user.home\"): " + System.getProperty("user.home") + " / ");

        System.out.println("env.getProperty(\"user.home\"): " + env.getProperty("user.home"));
    }
}