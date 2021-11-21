package declaringbeans.xml;

public class BeanC {

    BeanForInjection beanForInjection;

    public void setBeanForInjectionMethod(BeanForInjection beanForInjection) {
        this.beanForInjection = beanForInjection;
    }

    public void execute(){
        System.out.print("BeanC - injection in method / p:beanForInjectionMethod-ref=\"beanForInjection\"");
        beanForInjection.execute();
    }
}
