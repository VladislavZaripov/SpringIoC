package declaringbeans.xml;

import java.util.*;

public class BeanG {

    Map<String,String> map = new HashMap();
    Map<String, BeanForInjection> mapBean = new HashMap();
    Hashtable props = new Properties();
    Set<String> set = new HashSet();
    Set setBean = new HashSet();
    List<String> list = new ArrayList();
    List listBean = new ArrayList();

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setMapBean(Map<String, BeanForInjection> mapBean) {
        this.mapBean = mapBean;
    }

    public void setProps(Hashtable props) {
        this.props = props;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setSetBean(Set setBean) {
        this.setBean = setBean;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setListBean(List listBean) {
        this.listBean = listBean;
    }

    public void execute(){
        System.out.println("BeanG - injection collection");
    }
}