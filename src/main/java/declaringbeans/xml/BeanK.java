package declaringbeans.xml;

public class BeanK {

    private String string;

    public void setString(String string) {
        this.string = string;
        System.out.print(string);
    }

    private BeanKone beanKone;
    private BeanKtwo beanKtwo;
    private BeanKthree beanKthree;

    public BeanK() {
    }

    public BeanK(BeanKone beanKone) {
        this.beanKone = beanKone;
        System.out.print("beanKconstructor - autowire / beanKone called");
    }

    public BeanK(BeanKone beanKone, BeanKtwo beanKtwo) {
        this.beanKone = beanKone;
        this.beanKtwo = beanKtwo;
        System.out.print("beanKconstructor - autowire / beanKone & beanKtwo called");
    }

    public void setBeanKone(BeanKone beanKone) {
        this.beanKone = beanKone;
        System.out.print(" / beanKone property called");
    }

    public void setBeanKtwoAnotherName(BeanKtwo beanKtwo) {
        this.beanKtwo = beanKtwo;
        System.out.print(" / beanKtwo property called");
    }

    public void setBeanKthreeAnotherName(BeanKthree beanKthree) {
        this.beanKthree = beanKthree;
        beanKthree.execute();
        System.out.print(" property called with Primary");
    }

    public void execute(){
        System.out.println("");
    }
}