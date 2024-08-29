package org.practice.finalreview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {


    public static int[] sortArr(int[] arr){

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i = 0 ; i < arr.length ; i++){
                if(arr[i]==0){
                    countZero++;
                }else if(arr[i] == 1){
                    countOne++;
                }else{
                    countTwo++;
                }
        }

        for(int i = 0 ; i < arr.length ; i++) {
           if(countZero!=0){
               arr[i] = 0;
               countZero--;
           }else if(countOne!=0){
               arr[i] = 1;
               countOne--;
           }else if(countTwo!=0){
               arr[i] = 2;
               countTwo--;
           }


        }

        return arr;
    }


    public static int maxProfit(int[] arr){
        int maxP = 0;
        for(int i = 1 ; i < arr.length  ; i++){

            if(arr[i] > arr[i-1]){
                maxP= maxP + arr[i] - arr[i-1];
            }


        }


        return maxP;
    }

    public static void main(String[] args)
    {
   int[] arr1 = {100, 180, 260, 310, 40, 535, 695};

          int cpus = Runtime.getRuntime().availableProcessors();
        System.out.println("cpus" + cpus);
        System.out.println("Max Profit - " + maxProfit(new int[]{100,120,140,200,20,40,120}));
        int[] arr2 = sortArr(new int[]{2,1,2,1,0,0,0});
        Arrays.stream(arr1).forEach(s-> System.out.println(s));
        // 	“New York City, the most populous city in the United States, located in the state of NEW YORK” . Select only words
        // 	which contain no more than 5 characters and convert them to uppercase. Print converted words without duplicates.
        String str1 = "New York City, the most populous city in the United States, located in the state of NEW YORK";
        String res = Arrays.stream(str1.split(" ")).filter(s->s.length()< 5).map(s->s.toUpperCase()).distinct().collect(Collectors.joining(" "));
        System.out.println(res);





        System.out.println("Hello World");
        String s = "the sky is blue";
        String[] arr = Stream.of(s.split(" ")).toArray(String[]::new);
        String[] reversedArray = IntStream.rangeClosed(1, arr.length)
                .mapToObj(i -> arr[arr.length - i])
                .toArray(String[] ::new);
        new StringBuilder(Arrays.toString(reversedArray));
        System.out.println(arr[0]);
        System.out.println(arr[0]);

        int[] nums = {1,2,44,4,4,4};
        nums = Arrays.stream(nums).distinct().toArray();
    }
}
