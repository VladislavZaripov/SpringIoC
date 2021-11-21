package theory.typedependency.lookup;

import theory.typedependency.Container;
import theory.typedependency.TestDependency;

public class ContextualizedDependencyLookup{

    private TestDependency testDependency;

    public void performLookup(Container container) {
        this.testDependency = (TestDependency) container.getDependency("TestDependency");
    }

}