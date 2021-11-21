package declaringbeans.xml;

public class BeanF {

    String string;
    Integer integer;

    public void setString(String string) {
        this.string = string;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public void execute(){
        System.out.println("BeanF - SPeL injection / p:string = \"#{beanForInjection.string}\" p:integer = \"#{beanForInjection.integer + 5}\" / " + string + " & " + integer + " are injected");
    }
}