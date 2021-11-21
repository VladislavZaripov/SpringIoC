package declaringbeans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

public class BeanNamesConfigurationClass {

    public void execute(ApplicationContext ctx){
        System.out.print("BeanNamesConfigurationClass - names and alias / ");

        Map<String, BeanNamesConfigurationClass> beans = ctx.getBeansOfType(BeanNamesConfigurationClass.class);
        beans.entrySet().stream().forEach(b ->
        {
            System.out.println("id: "
                    + b.getKey()
                    + " | aliases: "
                    + Arrays.toString(ctx.getAliases(b.getKey())));
        });
    }
}