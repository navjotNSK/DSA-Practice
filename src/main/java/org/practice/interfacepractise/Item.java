package org.practice.interfacepractise;

public class Item implements Foldable{

    public static void main(String[] args){
        Item item = new Item();
        item.fold();
        Foldable.print();

        Parent parent = new Parent();
        Child child = new Child();
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;

        System.out.println("Parent Object Methods - ");
        parent.print();
        parent.fold();
        ((Child) parent1).childMethod();

        System.out.println("Child Object Methods - ");
        child.fold();
        child.print();
        child1.childMethod();

        System.out.println("Parent Child Object Methods - ");
        parent1.fold();
        parent1.print();

        System.out.println("Child Parent Child Object Methods - ");
        child1.fold();
        child1.print();

    }



}
