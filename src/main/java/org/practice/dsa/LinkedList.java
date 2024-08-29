package org.practice.dsa;

import java.util.Arrays;
import java.util.PriorityQueue;

class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public Node reverseKGroup(Node head, int k) {
        if(size(head)<k){
            return head;
        }
        Node current=head;
        Node prev=null;
        Node next=null;
        int count=0;
        while(count!=k && current!=null){
            count++;
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head.next=reverseKGroup(current,k);
        return prev;
    }

    public int size(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    /* Function to reverse the linked list */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {  // current = 1
            next = current.next; // Storing value of next , next = 2
            current.next = prev; //
            prev = current; // prev = 1
            current = next; // current = 2
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


     void arrayEvenAndOdd(int arr[], int n)
    {
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0) {


                // Swapping even and odd numbers
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; i++;
            }
        }

        // Printing segregated array
        for (int k = 0; k < n; k++)
            System.out.print(arr[k] + " ");
    }


    public int tripletSum(int[] arr , int target){

        for(int i = 0 ; i < arr.length ; i++){
            int start = i;
            int end = arr.length - 1;
           while(start < end){
               if(arr[i] + arr[start] + arr[end] == target){
                   return 1;
               }else if(arr[i] + arr[start] + arr[end] < target){
                   start++;
               }else{
                   end--;
               }
           }
        }

        return -1;
    }

    public int smallestMissingNo(int[] arr){
        arr = Arrays.stream(arr).sorted().distinct().toArray();

        for(int i = 0 ; i < arr.length ; i++){
             if(arr[i]!=i){
                 return i;
             }
        }

        return -1;
    }

    public int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }else if(arr[i] >second_largest){
                second_largest = arr[i];
            }

        }

        return second_largest;
    }

    public int[] partitionZero(int[] arr){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }

        }
        while(count<arr.length){
            arr[count++] = 0;
        }

        return arr;

    }


    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort the intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Create a priority queue to store the end times of intervals
        PriorityQueue<Integer> allocator = new PriorityQueue<>(intervals.length);

        // Add the first meeting
        allocator.add(intervals[0][1]);

        // Iterate over remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            // If the room due to free up the earliest is free, reuse it
            if (intervals[i][0] >= allocator.peek()) {
                allocator.poll();
            }

            // If a new room is to be assigned, then add to the heap
            allocator.add(intervals[i][1]);
        }

        // The size of the heap tells us the minimum rooms required for all the meetings.
        return allocator.size();
    }

    // Driver Code
    public static void main(String[] args)
    {


        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int result = minMeetingRooms(intervals);
        System.out.println(result);  // Output: 2

        LinkedList list = new LinkedList();
//        Arrays.stream(list.partitionZero(new int[]{3,51,3,0,3,4,0,0,0,3,1,-3})).forEach(s-> System.out.println(s));
//        System.out.println(list.secondLargest(new int[]{4,1,2,3}));
        System.out.println(list.tripletSum(new int[]{3,51,3,0,3,4,0,0,0,3,1,3 , 6 , 9 , 8} ,60));
        list.arrayEvenAndOdd(new int[]{3,51,3,0,3,4,0,0,0,3,1,3 , 6 , 9 , 8} , 15);
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
//        head = list.reverse(head);
       Node rev = list.reverseKGroup(head,2);
        list.printList(rev);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
