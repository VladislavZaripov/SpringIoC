package theory.typedependency.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import theory.typedependency.TestDependency;

public class ExtractingDependencies {

    public void execute(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-context.xml");

        TestDependency testObject = ctx.getBean("TestDependency", TestDependency.class);
    }
}