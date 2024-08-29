package org.practice.expedia;

public class Node {
    public Node next;
    public int value;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public Node next(){
        return next;
    }


}
