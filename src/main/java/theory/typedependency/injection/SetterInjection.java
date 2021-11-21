package theory.typedependency.injection;

import theory.typedependency.TestDependency;

public class SetterInjection {

    private TestDependency testDependency;

    public void setTestDependency(TestDependency testDependency) {
        this.testDependency = testDependency;
    }

}