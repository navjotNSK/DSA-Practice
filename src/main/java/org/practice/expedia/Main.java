package org.practice.expedia;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
        int[] arr = {1,3,4,5,2,4};
        findTripletSum(arr,6);
    }

    public Node getNode(Node curr , int k){
        while(curr !=null && k > 0){
            curr = curr.next();
            k--;
        }
        return curr;
    }

    public Node reverseGroup(Node head , int k) {
        if(head == null || k <=1)
            return head;

        Node prev;
        Node curr;
        Node next;

        Node temp = head;
        curr = temp;
        while(temp!=null && temp.next!=null){
            prev = temp;
            curr = temp.next;
            next = curr.next;
            temp = temp.next;
        }

        Node rev = getNode(curr,k);

return null;

    }


    public static void findTripletSum(int[] A , int target) {
        Arrays.sort(A);

        for(int i = 0 ; i < A.length - 2 ; i++){
            int j = i+1;
            int k = A.length - 1;

            while(j < k ){

                if(A[i] + A[j] + A[k] == target){
                    System.out.println("Numbers are - " + A[i] + " " + A[j] + " " + A[k]);
                    break;
                }else if(A[i] + A[j] + A[k] < target){
                    j++;
                }else{
                    k--;
                }
            }

        }
    }

}
