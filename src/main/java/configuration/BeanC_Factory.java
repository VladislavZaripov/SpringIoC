package configuration;

public class BeanC_Factory {

    BeanC beanC;

    String properties;

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public BeanC createObject() throws Exception {
        beanC = new BeanC(properties);
        return beanC;
    }
}