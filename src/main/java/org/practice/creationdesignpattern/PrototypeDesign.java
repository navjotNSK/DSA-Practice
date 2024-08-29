package org.practice.creationdesignpattern;


class Owner implements Cloneable{
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public  Owner clone() {
        try {
            Owner clone = (Owner) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class  PrototypeDesign implements Cloneable{

    private Owner owner;

    public PrototypeDesign(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public PrototypeDesign clone() {
        try {
            PrototypeDesign obj = (PrototypeDesign) super.clone();
            obj.owner = owner.clone();
            return obj;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }




    public static void main(String[] args){
        PrototypeDesign obj = new PrototypeDesign(new Owner("Navjot"));
        System.out.println(obj.hashCode() + "  Owner 1 - " + obj.getOwner().getName());

        PrototypeDesign obj2 = obj.clone();


        obj2.getOwner().setName("Ramesh");

        System.out.println(obj.hashCode() + "  Owner 1 - " + obj.getOwner().getName());
        System.out.println(obj2.hashCode()+ "  Owner 2 - " + obj.getOwner().getName());
    }
}
