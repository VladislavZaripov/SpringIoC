package declaringbeans.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanJ {

    public void execute(GenericXmlApplicationContext ctx){
        System.out.print("BeanJ - depends-on");
        BeanForInjection beanForInjection = ctx.getBean("beanForInjection", BeanForInjection.class);
        beanForInjection.execute();
    }
}