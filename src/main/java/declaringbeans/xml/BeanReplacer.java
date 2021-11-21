package declaringbeans.xml;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class BeanReplacer implements MethodReplacer {

    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        switch (isFormatMessageMethod(method)){
            case 1: return "Reimplement method String: " + objects[0];
            case 2: return "Reimplement method Object: " + objects[0];
            default: throw new IllegalArgumentException("Unable to reimplement method "+ method.getName());
        }
    }

    private int isFormatMessageMethod(Method method){
        if(method.getParameterTypes().length==1
                & method.getName().equals("formatMessage")
                & method.getParameterTypes()[0]==String.class
                & method.getReturnType()==String.class)
            return 1;
        if(method.getParameterTypes().length==1
                & method.getName().equals("formatMessage")
                & method.getParameterTypes()[0]==Object.class
                & method.getReturnType()==String.class)
            return 2;
        return 0;
    }
}