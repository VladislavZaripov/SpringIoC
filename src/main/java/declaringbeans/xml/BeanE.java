package declaringbeans.xml;

public class BeanE {

    String string;
    Integer integer;
    Boolean aBoolean;

    public void setString(String string) {
        this.string = string;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public void execute(){
        string = new String("sdf");

        System.out.println("BeanE - injection in field / " + string + " & " + integer + " & " + aBoolean+ " are injected");
    }
}