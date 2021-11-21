package lifecyclebeans;

public class BeanA {

    String name;
    Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void init(){
        System.out.println("BeanA - init / xml init-method, name = " + name + ", age = " + age);
    }

    public void destroy(){
        System.out.println("BeanA - destroy / xml destroy-method");
    }

    public void execute(){
    }
}