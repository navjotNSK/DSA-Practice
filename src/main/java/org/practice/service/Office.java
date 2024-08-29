package org.practice.service;

public class Office extends Building{

    @Override
    public String toString() {
        return "Office{}";
    }

    @Override
    public void print(){
        System.out.print("Office Method");

    }
}
