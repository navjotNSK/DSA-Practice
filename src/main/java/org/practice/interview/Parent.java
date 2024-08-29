package org.practice.interview;

public class Parent{
    public void print(){
        System.out.println("I am Parent");
    }
}
 class MainClass {
    public static void main(String args[]) {
        Parent parent = null;
        parent.print();
    }
}