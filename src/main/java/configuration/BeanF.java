package configuration;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;

public class BeanF {

    public void execute(GenericXmlApplicationContext gctx){
        Locale english = Locale.US;
        Locale german = Locale.GERMANY;
        Locale france = Locale.FRANCE;

        System.out.print("BeanF - ");
        System.out.print(gctx.getMessage("msg",null,english) + " ");
        System.out.print(gctx.getMessage("nameMsg",new Object[]{"Vlad","Zaripov"},english) + " / ");
        System.out.print(gctx.getMessage("msg",null,german) + " ");
        System.out.print(gctx.getMessage("nameMsg",new Object[]{"Vlad","Zaripov"},german) + " / ");

        System.out.println(gctx.getMessage("msg",null,"Default message!",france));
    }
}