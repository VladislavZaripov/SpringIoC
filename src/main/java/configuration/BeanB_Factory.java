package configuration;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanB_Factory implements FactoryBean<BeanB>, InitializingBean {

    BeanB beanB;

    String properties;

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public BeanB getObject() throws Exception {
        return beanB;
    }

    @Override
    public Class<BeanB> getObjectType() {
        return BeanB.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        beanB = new BeanB(properties);
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}