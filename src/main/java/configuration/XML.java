package configuration;

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

    BeanD_PropertyEditorDefault beanD_PropertyEditorDefault;

    public void setBeanD_PropertyEditorDefault(BeanD_PropertyEditorDefault beanD_PropertyEditorDefault) {
        this.beanD_PropertyEditorDefault = beanD_PropertyEditorDefault;
    }

    BeanE_PropertyEditorCustom beanE_PropertyEditorCustom;

    public void setBeanE_PropertyEditorCustom(BeanE_PropertyEditorCustom beanE_PropertyEditorCustom) {
        this.beanE_PropertyEditorCustom = beanE_PropertyEditorCustom;
    }

    BeanF beanF;

    public void setBeanF(BeanF beanF) {
        this.beanF = beanF;
    }

    BeanG_EventPublisher beanG_EventPublisher;

    public void setBeanG_EventPublisher(BeanG_EventPublisher beanG_EventPublisher) {
        this.beanG_EventPublisher = beanG_EventPublisher;
    }

    BeanH beanH;

    public void setBeanH(BeanH beanH) {
        this.beanH = beanH;
    }

    BeanJ beanJ;

    public void setBeanJ(BeanJ beanJ) {
        this.beanJ = beanJ;
    }

    BeanK beanK;

    public void setBeanK(BeanK beanK) {
        this.beanK = beanK;
    }

    BeanM beanM;

    public void setBeanM(BeanM beanM) {
        this.beanM = beanM;
    }

    BeanN beanN;

    public void setBeanN(BeanN beanN) {
        this.beanN = beanN;
    }

    public void execute(GenericXmlApplicationContext gctx) throws Exception{
        beanA.execute();
        beanB.execute();
        beanC.execute();
        beanD_PropertyEditorDefault.execute();
        beanE_PropertyEditorCustom.execute();
        beanF.execute(gctx);
        beanG_EventPublisher.execute();
        beanH.execute(gctx);
        beanJ.execute();
        beanK.execute();
        beanM.execute(gctx);
        beanN.execute(gctx);
    }
}