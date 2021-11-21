package declaringbeans.xml;

public abstract class BeanH {

    BeanForInjection beanForInjection;

    public void setBeanForInjectionMethod(BeanForInjection beanForInjection) {
        this.beanForInjection = beanForInjection;
    }

    public abstract BeanForInjection getAbstractBeanForInjection();

    public void execute(){
        System.out.print("BeanH - injection LookUp");
        System.out.print("/ setter: " + beanForInjection.equals(beanForInjection));
        System.out.println(" / LookUp method: " + getAbstractBeanForInjection().equals(getAbstractBeanForInjection()));
    }
}