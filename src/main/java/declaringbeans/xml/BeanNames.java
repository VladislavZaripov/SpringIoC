package declaringbeans.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class BeanNames {

    public void execute(GenericXmlApplicationContext ctx){
        System.out.print("BeanNames - names and alias / ");

        Map<String, BeanNames> beans = ctx.getBeansOfType(BeanNames.class);
        beans.entrySet().stream().forEach(b ->
        {
            System.out.println("id: "
                    + b.getKey()
                    + " | aliases: "
                    + Arrays.toString(ctx.getAliases(b.getKey())));
        });
    }
}