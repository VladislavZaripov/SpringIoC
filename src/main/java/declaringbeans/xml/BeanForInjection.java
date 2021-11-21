package declaringbeans.xml;

public class BeanForInjection {

    public String string = "text";
    public Integer integer = 5;

    public void execute(){
        System.out.println(" / BeanForInjection is injected");
    }
}