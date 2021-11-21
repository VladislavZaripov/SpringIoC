package declaringbeans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

@Component("ID BeanNames")
public class BeanNamesAnnotation {
    public void execute(ApplicationContext ctx){
        System.out.print("BeanNamesAnnotation - names and alias / ");

        Map<String, BeanNamesAnnotation> beans = ctx.getBeansOfType(BeanNamesAnnotation.class);
        beans.entrySet().stream().forEach(b ->
        {
            System.out.println("id: "
                    + b.getKey()
                    + " | aliases: "
                    + Arrays.toString(ctx.getAliases(b.getKey())));
        });
    }
}