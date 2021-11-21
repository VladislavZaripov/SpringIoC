package configuration;

public class BeanB {

    String properties;

    public BeanB(String properties) {
        this.properties = properties;
    }

    public void execute(){
        System.out.println("BeanB - from BeanBFactory interface FactoryBean<BeanB>, InitializingBean / properties: " + properties);
    }
}