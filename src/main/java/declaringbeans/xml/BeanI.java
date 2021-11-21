package declaringbeans.xml;

public class BeanI {


    public String formatMessage(String string){
        return "String method: " + string;
    }

    public String formatMessage(Object string){
        return "Object method: " + string;
    }

    public void execute(String string){
        System.out.print(string + " - MethodReplacer / ");
        System.out.println(formatMessage("argument") + " / " + formatMessage(new Object()));
    }
}