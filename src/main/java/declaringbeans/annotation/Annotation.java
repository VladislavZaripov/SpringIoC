package declaringbeans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Annotation {

    @Autowired
    BeanA beanA;

    @Autowired
    BeanB beanB;

    @Autowired
    BeanC beanC;

    @Autowired
    BeanD beanD;

    @Autowired
    BeanE beanE;

    @Autowired
    BeanF beanF;

    @Autowired
    BeanG beanG;

    @Autowired
    BeanH beanH;

    @Autowired
    BeanNamesAnnotation beanNamesAnnotation;

    @Autowired
    BeanNamesConfigurationClass beanNamesConfigurationClass;

    @Autowired
    BeanI beanI;

    @Autowired
    BeanJ beanJ;

    public void execute(ApplicationContext ctx){
        System.out.println("\n---Declaring Beans Annotation---");

        beanA.execute();
        beanB.execute();
        beanC.execute();
        beanD.execute();
        beanE.execute();
        beanF.execute();
        beanG.execute();
        beanH.execute();
        beanNamesAnnotation.execute(ctx);
        beanNamesConfigurationClass.execute(ctx);
        beanI.execute(ctx);
        beanJ.execute();
    }
}