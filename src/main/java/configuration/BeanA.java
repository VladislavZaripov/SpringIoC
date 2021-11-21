package configuration;

import org.springframework.beans.factory.BeanNameAware;

public class BeanA implements BeanNameAware {

    String nameBean;

    public void execute(){
        System.out.println("BeanA - BeanNameAware interface / nameBean = " + nameBean);
    }

    @Override
    public void setBeanName(String s) {
        nameBean = s;
    }
}