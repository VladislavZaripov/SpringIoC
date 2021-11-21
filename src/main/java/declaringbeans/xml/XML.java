package declaringbeans.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class XML {

    BeanA beanA;
    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

    BeanB beanB;
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    BeanC beanC;
    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }

    BeanD beanD;
    public void setBeanD(BeanD beanD) {
        this.beanD = beanD;
    }

    BeanE beanE;
    public void setBeanE(BeanE beanE) {
        this.beanE = beanE;
    }

    BeanF beanF;
    public void setBeanF(BeanF beanF) {
        this.beanF = beanF;
    }

    BeanG beanG;
    public void setBeanG(BeanG beanG) {
        this.beanG = beanG;
    }

    BeanH beanH;
    public void setBeanH(BeanH beanH) {
        this.beanH = beanH;
    }

    BeanI beanI;
    public void setBeanI(BeanI beanI) {
        this.beanI = beanI;
    }

    BeanI beanIWithBeanReplacer;
    public void setBeanIWithBeanReplacer(BeanI beanIWithBeanReplacer) {
        this.beanIWithBeanReplacer = beanIWithBeanReplacer;
    }

    BeanNames beanNames;
    public void setBeanNames(BeanNames beanNames) {
        this.beanNames = beanNames;
    }

    BeanParent beanParent;
    public void setBeanParent(BeanParent beanParent) {
        this.beanParent = beanParent;
    }

    BeanJ beanJ;
    public void setBeanJ(BeanJ beanJ) {
        this.beanJ = beanJ;
    }

    BeanL beanL;
    public void setBeanL(BeanL beanL) {
        this.beanL = beanL;
    }

    public void execute(GenericXmlApplicationContext ctx){
        System.out.println("\n---Declaring Beans XML---");

        beanA.execute();
        beanB.execute();
        beanC.execute();
        beanD.execute();
        beanE.execute();
        beanF.execute();
        beanParent.execute();
        beanG.execute();
        beanH.execute();
        beanI.execute("BeanI");
        beanIWithBeanReplacer.execute("BeanIWithBeanReplacer");
        beanNames.execute(ctx);
        beanJ.execute(ctx);
        ctx.getBean("beanKbyName",BeanK.class).execute();
        ctx.getBean("beanKbyType",BeanK.class).execute();
        ctx.getBean("beanKconstructor",BeanK.class).execute();
        beanL.execute();
    }
}