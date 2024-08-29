package org.practice.service;

public class Customer {


    public Boolean served;
    public String name;

    public Customer(String name) {
        this.served = false;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void serve(){
        this.served = true;
    }


    public static void serveCustomer(Customer customer){
        customer.served = true;
    }
}
