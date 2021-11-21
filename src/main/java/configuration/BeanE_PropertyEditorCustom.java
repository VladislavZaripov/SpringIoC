package configuration;

public class BeanE_PropertyEditorCustom {
    String firstName;
    String lastName;

    public BeanE_PropertyEditorCustom(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "BeanEPropertyEditorCustom{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void execute(){
        System.out.println("BeanEPropertyEditorCustom - customEditorConfigurer XML / " + this);
    }
}