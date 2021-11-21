package declaringbeans.xml;

public class BeanB {

    BeanForInjection beanForInjection;

    public void setBeanForInjectionMethod(BeanForInjection beanForInjection) {
        this.beanForInjection = beanForInjection;
    }

    public void execute(){
        System.out.print("BeanB - injection in method / <property name=\"beanForInjectionMethod\" ref=\"beanForInjection\"/>");
        beanForInjection.execute();
    }
}
