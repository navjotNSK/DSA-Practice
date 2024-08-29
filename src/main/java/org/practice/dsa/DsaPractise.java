package org.practice.dsa;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DsaPractise {

    public static void main(String[] args)  {
        winnerAndLoser("aabbccddeff");
        System.out.println("----------------------------");
        List<List<Integer>> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(Arrays.asList(11,6));
        listOfIntegers.add(Arrays.asList(11,4));
        listOfIntegers.add(Arrays.asList(7,6));
        listOfIntegers.add(Arrays.asList(11,2));
        listOfIntegers.add(Arrays.asList(7,4));
        listOfIntegers.add(Arrays.asList(7,2));
        listOfIntegers.add(Arrays.asList(1,6));
        listOfIntegers.add(Arrays.asList(1,4));
        listOfIntegers.add(Arrays.asList(1,2)); //[1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
        sortListofList(listOfIntegers).stream().forEach(s-> System.out.println(s.get(0) + " " + s.get(1)));
        DsaPractise ds = new DsaPractise();
        Arrays.stream(ds.sortSelection(new int[]{5, 4, 3, 2, 1})).forEach(x-> System.out.println(x));
        List<Order> list = new ArrayList<>();
        Order order1 = new Order("order1" , new String[]{"Toothpaste" , "Biscuit"} , LocalDateTime.now());
        try {
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
        Order order2 = new Order("order2" , new String[]{"Dabur Toothpaste" , "50-50 Biscuit"} , LocalDateTime.now());
        list.add(order1);
        list.add(order2);
        list.stream().sorted(Comparator.comparing(Order::getDateOfOrder).reversed()).limit(3).forEach(s-> System.out.println(s.getOrderId() + " " + s.getDateOfOrder()));
    }

    public static void winnerAndLoser(String str) {

        Optional<Map.Entry<String, Long>> max  = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity() , Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
        System.out.println(max.get());
        Map<String, Long> frequencyMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<String, Long>> maxEntry = frequencyMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));

        Optional<Map.Entry<String, Long>> minEntry = frequencyMap.entrySet().stream()
                .min(Comparator.comparing(Map.Entry::getValue));

        String winner = "none";
        String loser = "none";

        if (maxEntry.isPresent() && frequencyMap.values().stream().filter(v -> v.equals(maxEntry.get().getValue())).count() == 1) {
            winner = maxEntry.get().getKey();
        }

        if (minEntry.isPresent() && frequencyMap.values().stream().filter(v -> v.equals(minEntry.get().getValue())).count() == 1) {
            loser = minEntry.get().getKey();
        }

        System.out.println("winner: " + winner + ", loser: " + loser);
    }

    public static List<List<Integer>> sortListofList(List<List<Integer>> list){

       return list.stream().sorted(Comparator.comparing(l->l.stream().reduce(0, Integer::sum))).toList();

    }

    public int[] sortSelection(int[] arr){
        
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min_index = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                    swap(arr, i, j);

                }

            }
        }
return arr;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
