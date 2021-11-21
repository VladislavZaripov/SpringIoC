package lifecyclebeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanB implements InitializingBean, DisposableBean {

    String name;
    Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanB - init / interface InitializingBean, name = " + name + ", age = " + age);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanB - destroy / interface DisposableBean");
    }

    public void execute(){
    }
}