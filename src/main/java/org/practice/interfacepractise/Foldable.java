package org.practice.interfacepractise;

public interface Foldable {

    public static void print(){
        System.out.println("Print");

    }

    default void fold(){
        System.out.println("Fold");

    }

}
