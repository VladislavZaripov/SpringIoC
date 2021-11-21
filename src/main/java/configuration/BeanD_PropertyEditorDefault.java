package configuration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

public class BeanD_PropertyEditorDefault {

    private byte[] bytes; // ByteArrayPropertyEditor
    private Character character; // CharacterEditor
    private Class cls; // ClassEditor
    private Boolean trueOrFalse; // CustomBooleanEditor
    private List<String> stringList; // CustomCollectionEditor
    private Date date; // CustomDateEditor
    private Float floatValue; // CustomNumЬerEditor
    private File file; // FileEditor
    private InputStream stream; // InputStreamEditor
    private Locale locale; // LocaleEditor
    private Pattern pattern; // PatternEditor
    private Properties properties; // PropertiesEditor
    private String trimString; // StringTrimmerEditor
    private URL url; // URLEditor

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }

    public void setTrueOrFalse(Boolean trueOrFalse) {
        this.trueOrFalse = trueOrFalse;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setTrimString(String trimString) {
        this.trimString = trimString;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void execute(){
        System.out.println("BeanDPropertyEditorDefault - org.springframework.beans.propertyeditors");
    }
}