package declaringbeans.xmlannotation;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.*;

@Component
public class BeanB {

    @Resource(name="map")
    Map<String,String> map = new HashMap();

    @Resource (name="mapBean")
    Map<String, declaringbeans.xml.BeanForInjection> mapBean = new HashMap();

    @Resource (name="props")
    Hashtable props = new Properties();

    @Resource (name="set")
    Set<String> set = new HashSet();

    @Resource (name="setBean")
    Set setBean = new HashSet();

    @Resource (name="list")
    List<String> list = new ArrayList();

    @Resource (name="listBean")
    List listBean = new ArrayList();


    public void execute(){
        System.out.println("BeanB - injection collection");
    }
}