import configuration.BeanB_Factory;
import declaringbeans.annotation.Annotation;
import declaringbeans.xml.XML;
import declaringbeans.xmlannotation.XMLAnnotation;
import lifecyclebeans.ConfigurationClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Executor {

    public static void main(String[] args) throws Exception{

        executeDeclaringBeansAnnotation();
        executeDeclaringBeansXML();
        executeDeclaringBeansXMLAnnotation();

        executeLifeCycleBeans();

        executeConfiguration();
    }

    private static void executeDeclaringBeansAnnotation(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(declaringbeans.annotation.ConfigurationClass.class);

        Annotation annotation = ctx.getBean("annotation", Annotation.class);
        annotation.execute(ctx);
    }

    private static void executeDeclaringBeansXML() {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load(new ClassPathResource("declaringbeans/xml/configurationparent.xml"));
        parent.refresh();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load(new ClassPathResource("declaringbeans/xml/configuration.xml"));
        ctx.setParent(parent);
        ctx.refresh();

        XML xml = ctx.getBean("xml", XML.class);
        xml.execute(ctx);
    }

    private static void executeDeclaringBeansXMLAnnotation(){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load(new ClassPathResource("declaringbeans/xmlannotation/configuration-annotation.xml"));
        ctx.refresh();

        XMLAnnotation xmlAnnotation = ctx.getBean("XMLAnnotation",XMLAnnotation.class);
        xmlAnnotation.execute();
    }

    private static void executeLifeCycleBeans(){
        System.out.println("\n---LifeCycle Beans---");

        GenericXmlApplicationContext gctx = new GenericXmlApplicationContext();
        gctx.load(new ClassPathResource("lifecyclebeans/configuration.xml"));
        gctx.refresh();
        lifecyclebeans.XML xml = gctx.getBean("xml", lifecyclebeans.XML.class);
        xml.execute();

        GenericApplicationContext actx = new AnnotationConfigApplicationContext(lifecyclebeans.ConfigurationClass.class);
        ConfigurationClass configurationClass = new ConfigurationClass();
        configurationClass.execute(actx);

        gctx.getDefaultListableBeanFactory().destroySingletons();
        actx.getDefaultListableBeanFactory().destroySingletons();
    }

    private static void executeConfiguration() throws Exception{
        System.out.println("\n---Configuration Beans---");

        GenericXmlApplicationContext gctx = new GenericXmlApplicationContext();
        gctx.getEnvironment().setActiveProfiles("Main");
        gctx.load(new ClassPathResource("configuration/configuration.xml"), new ClassPathResource("configuration/configurationSecondProfile.xml"));
        gctx.refresh();

        configuration.XML xml = gctx.getBean("xml", configuration.XML.class);
        xml.execute(gctx);

        BeanB_Factory beanBFactory = (BeanB_Factory)gctx.getBean("&beanB_FactoryContext");
        beanBFactory.getObject().execute();

        AnnotationConfigApplicationContext actx = new AnnotationConfigApplicationContext();
        actx.getEnvironment().setActiveProfiles("Main");
        actx.register(configuration.ConfigurationClass.class, configuration.ConfigurationClassSecondProfile.class);
        actx.refresh();

        configuration.ConfigurationClass configurationClass = new configuration.ConfigurationClass();
        configurationClass.execute(actx);
    }
}