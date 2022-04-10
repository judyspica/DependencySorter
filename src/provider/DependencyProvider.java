package provider;

import model.Dependency;

import java.util.List;

public class DependencyProvider {
    public static Dependency A = new Dependency("A", "https//a.toz", List.of());
    public static Dependency B = new Dependency("B", "https//b.toz", List.of());
    public static Dependency C = new Dependency("C", "https//c.toz", List.of(A));
    public static Dependency F = new Dependency("F", "https//f.toz", List.of(B, C));
    public static Dependency E = new Dependency("E", "https//e.toz", List.of(B, F));
    public static Dependency D = new Dependency("D", "https//d.toz", List.of(A, B, E));
    public static Dependency G = new Dependency("G", "https//g.toz", List.of(A, D));

    public static List<Dependency> getDependencies() {
        return List.of(A, B, C, D, E, F, G);
    }
}
