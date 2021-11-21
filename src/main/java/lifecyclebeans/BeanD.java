package lifecyclebeans;

public class BeanD {

    String name;
    Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void init(){
        System.out.println("BeanD - init / @Bean initMethod, name = " + name + ", age = " + age);
    }

    public void destroy(){
        System.out.println("BeanD - destroy / @Bean destroyMethod");
    }

    public void execute(){
    }
}