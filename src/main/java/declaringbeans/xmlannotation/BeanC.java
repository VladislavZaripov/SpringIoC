package declaringbeans.xmlannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("beanC")
public class BeanC {

    @Autowired
    @Qualifier("map")
    Map<String,String> map = new HashMap();

    public void execute(){
        System.out.println("beanC - injection collection - @Qualifier");
    }
}