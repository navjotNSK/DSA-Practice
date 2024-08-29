package org.practice;

import org.practice.service.Building;


import java.util.List;


public class Main {

   public static int firstNonRepeating(int[] arr){
      if(arr.length <=1){
          return arr[0];
      }

      int currVal = arr[0];
      for(int i = 1 ; i < arr.length ; i++){
          if(currVal ==arr[i]){
              return arr[i];
          }
          currVal = arr[i];

      }


       return -1;
   }

   private String name;
   private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Integer[] getIntArray() {
        return intArray;
    }

    public static void setIntArray(Integer[] intArray) {
        Main.intArray = intArray;
    }

    public static Character[] getCharArray() {
        return charArray;
    }

    public static void setCharArray(Character[] charArray) {
        Main.charArray = charArray;
    }

    // {-3,-1,0,1,2} -> -2-(-3) = 1
    // Map - {-3,1} , {-1,-1} ...
    public boolean sum(int[] arr , int target){


        //Iterate over array
        for(int i = 0 ; i < arr.length ; i++){

        }

        int res = 0;
        for(int i : arr){

        }


        return res == 1;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeating(new int[]{1,2,3,4,5,5}));
//Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x.
//Input: arr[] = {0, -1, 2, -3, 1}, x= -2
//Output: Yes
//Explanation: If we calculate the sum of the output,1 + (-3) = -2
//Input: arr[] = {1, -2, 1, 0, 5}, x = 0
//Output: No




        System.out.println("Hello World");
    }


    public static void printList(String... s){               //Varargs = String... represent array of String in arguments
        System.out.println(s.length + " " + s[0]);
    }



    public static <K> List<K> arrayToList(K[] array , List<K> list){
        for(K obj : array){
            list.add(obj);
        }

        return list;
    }


    static Integer[] intArray = {1,2,3};
    static Character[] charArray = {'a','b','c'};


    public static void printBuilding(List<? extends Building> buildingList){
    buildingList.forEach(System.out::println);
    }



//    public static void main(String[] args) {


        // Write a stream program to move all zero's to beginning of array int [] arr = {3, 0, 1, 0, 9, 0}
        //output - {0, 0, 0, 3, 1, 9}


//        int[] arr = {3,0,1,0,9,0};
//        List<int[]> arrL = Arrays.asList(arr);
//        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x-> x == 0)).entrySet().stream().map(x-> x.getValue()).reduce( (a,b) -> {b.addAll(a); return  b;}).get());
//
//        List<Integer> listZero = new ArrayList<>();
//        List<Integer> listNonZero = new ArrayList<>();
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i]==0){
//                listZero.add(0);
//            }else{
//                listNonZero.add(arr[i]);
//            }
//        }
//
//        int counter = 0;
//        for(int a : listZero){
//            arr[counter] = a;
//            counter++;
//        }
//        for(int a : listNonZero){
//            arr[counter] = a;
//            counter++;
//        }
//        Arrays.stream(arr).forEach(System.out::println);
//
//
//        Practise.getDate();
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5,3,2,3,3,3,2,2,2);
//
//                 list.stream()
//                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
//                .forEach((k,v)-> System.out.println(k + " : " + v));
//
//
//        list.stream()
//                .collect(Collectors.toMap(Function.identity(),x->1L ,(a,b)->a+b))
//                .forEach((k,v)-> System.out.println(k + " : " + v));



//        Practise practise = new Practise();
//        practise.getEncodedValue();
//
//
//
//        Bedroom room = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(3).setFloorNumber(2).setWallColor(Color.WHITE).setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true).setHasEnsuite(false).createBedroom();
//        Bedroom room2 = new BedroomBuilder().setDimensions(new Dimension(300, 250)).createBedroom();
//
//
//        GreetingMessage greetingMessage = new GreetingMessage() {
//            @Override
//            public void greet(String name) {
//                System.out.println("Hello " + name);
//            }
//        };
//
//
//
//
//        greetingMessage.greet("navjot");
//
//        Queue<Customer> queue = new LinkedList<>();
//
//
//        Customer customer = new Customer("Navjot");
//        System.out.println(customer.served);
//        customer.serve();
//        System.out.println(customer.served);
//        Customer.serveCustomer(customer);
//        System.out.println(customer.served);
//        queue.add(customer);
//        queue.peek();
//
//
//        Building building = new Building();
//        Office office = new Office();
//        Building building1 = new Office();
//        printBuilding(List.of(building));
//        printBuilding(List.of(building1));
//        List<Office> officeList = new ArrayList<>();
//        officeList.add(new Office());
//        printBuilding(officeList);
//        office.print();
//        building1.print();
//        Office office1 = (Office) building1;
//        office1.print();



//        printList("navjot" , "shwati");
//        List<Integer> list = arrayToList(intArray,new ArrayList<>());
//        List<Character> list2 = arrayToList(charArray,new ArrayList<>());
//        System.out.println(list.get(0) + " " + list2.get(2));
//
//        System.out.println("Hello world!");
//        List list3 = new ArrayList();
//        list3.add("navjot");
//        String name = (String) list3.get(0);
//        System.out.println(list3.get(0));
//    }
}