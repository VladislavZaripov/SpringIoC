package declaringbeans.xml;

public class BeanD {

    String string;
    int num;

    public BeanD(String string, int num) {
        this.string = string;
        this.num = num;
    }

    public void execute(){
        System.out.println("BeanD - injection in constructor / <constructor-arg value=\"/ String injected\"/> " + string + " & " + num + " are injected");
    }
}