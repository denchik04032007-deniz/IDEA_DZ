package praktika4.practice20;

import java.io.Serializable;

public class GenericTriple<T extends Comparable<T>, V extends Animal & Serializable, K> {

    private T t;
    private V v;
    private K k;

    public GenericTriple(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Имя класса для T: " + t.getClass().getSimpleName());
        System.out.println("Имя класса для V: " + v.getClass().getSimpleName());
        System.out.println("Имя класса для K: " + k.getClass().getSimpleName());
    }
}