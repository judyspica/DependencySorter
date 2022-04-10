package model;

import java.util.List;
import java.util.Objects;

public class Dependency {
    private final String name;
    private final String address;
    private final List<Dependency> dependencies;

    public Dependency(String name, String address, List<Dependency> dependencies) {
        this.name = name;
        this.address = address;
        this.dependencies = dependencies;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Dependency> getDependencies() {
        return List.copyOf(dependencies);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dependency)) return false;
        Dependency that = (Dependency) o;
        return name.equals(that.name) && address.equals(that.address) && dependencies.equals(that.dependencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, dependencies);
    }

    @Override
    public String toString() {
        return name;
    }
}
