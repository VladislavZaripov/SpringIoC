package theory.defaultlistablebeanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

    public void execute (){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new ClassPathResource("theory/defaultlistablebeanfactory/xml-bean-factory-config.xml"));

        BeanOne beanOne = (BeanOne) factory.getBean("beanOne");
        beanOne.execute();
    }
}