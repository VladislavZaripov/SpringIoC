package lifecyclebeans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanC {

    String name;
    Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @PostConstruct
    public void init(){
        System.out.println("BeanC - init / @PostConstruct, name = " + name + ", age = " + age);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BeanC - destroy / @PreDestroy");
    }

    public void execute(){
    }
}