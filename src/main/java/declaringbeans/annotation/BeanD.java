package declaringbeans.annotation;

public class BeanD {

    BeanForInjection beanForInjection;

    public void setBeanForInjection(BeanForInjection beanForInjection) {
        this.beanForInjection = beanForInjection;
    }

    public void execute(){
        System.out.print("beanD - injection in configuration class - @Bean");
        beanForInjection.execute();
    }
}