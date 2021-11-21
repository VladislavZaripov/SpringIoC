package configuration;

public class BeanC {

    String properties;

    public BeanC(String properties) {
        this.properties = properties;
    }

    public void execute(){
        System.out.println("BeanC - from BeanCFactory without interface / properties: " + properties);
    }
}