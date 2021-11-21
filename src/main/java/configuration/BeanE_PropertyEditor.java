package configuration;

import java.beans.PropertyEditorSupport;

public class BeanE_PropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String [] name = text.split("\\s");
        setValue(new BeanE_PropertyEditorCustom(name[0],name[1]));
    }
}