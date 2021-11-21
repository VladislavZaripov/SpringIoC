package declaringbeans.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BeanE {

    String text;

    public BeanE(@Value("text is injected") String text) {
        this.text = text;
    }

    public void execute(){
        System.out.println("BeanE - injection in constructor - (@Value(\"text is injected\") String text) / " + text);
    }
}