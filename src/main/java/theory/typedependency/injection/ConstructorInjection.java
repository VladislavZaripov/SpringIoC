package theory.typedependency.injection;

import theory.typedependency.TestDependency;

public class ConstructorInjection {

    private TestDependency testDependency;

    public ConstructorInjection(TestDependency testDependency) {
        this.testDependency = testDependency;
    }

}