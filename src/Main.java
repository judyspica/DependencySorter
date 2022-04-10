import logic.Sorter;
import model.Dependency;
import provider.DependencyProvider;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dependency> dependencies = DependencyProvider.getDependencies();
        List<Dependency> sortedDependencies = Sorter.sortDependencies(dependencies);
        sortedDependencies.forEach(System.out::println);
    }
}
