package logic;

import model.Dependency;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    public static List<Dependency> sortDependencies(final List<Dependency> unsortedDependencies) {
        final List<Dependency> sortedDependencies = new ArrayList<>();

        while (sortedDependencies.size() != unsortedDependencies.size()) {
            unsortedDependencies
                    .stream()
                    .filter(dependency -> !dependencyNameExistsInSortedDependencies(dependency.getName(), sortedDependencies))
                    .filter(dependency -> hasAllItsDependenciesSatisfied(dependency.getDependencies(), sortedDependencies))
                    .forEach(sortedDependencies::add);
        }

        return sortedDependencies;
    }

    private static boolean hasAllItsDependenciesSatisfied(
            final List<Dependency> dependencies,
            final List<Dependency> sortedDependencies) {
        return dependencies
                .stream()
                .map(Dependency::getName)
                .allMatch(dependencyName -> dependencyNameExistsInSortedDependencies(dependencyName, sortedDependencies));
    }

    private static boolean dependencyNameExistsInSortedDependencies(
            final String dependencyName,
            final List<Dependency> sortedDependencies) {
        return sortedDependencies
                .stream()
                .map(Dependency::getName)
                .anyMatch(dependencyName::equals);
    }
}
