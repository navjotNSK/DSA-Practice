package org.practice.equalsandhashcodecontract;

import java.util.*;
import java.util.stream.*;

public class Person {
    String name;
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args){

//        String s = "Hello";
         String t = new String("Hello");
//         if ("Hello".equals(s)) System.out.println("one");
//         if (t == s) System.out.println("two");
//         if (t.equals(s)) System.out.println("three");
//         if ("Hello" == s) System.out.println("four");
         if ("Hello" == t) System.out.println("five");

        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        if (opt.isPresent()) System.out.println(opt.getAsLong());



        System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x ->""+ x).collect(Collectors.joining()));


        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();
        Stream.of(l1, l2, l3).map(x -> x)
                .forEach(System.out::print);

//
//         Stream<Integer> s = Stream.of(1);
//         IntStream is = s.mapToInt(x -> x);
//         DoubleStream ds = s.mapToDouble(x -> x);
//         ds.forEach(System.out::print);
//
//        Stream	<String> s = Stream.empty();
//        Stream<String> s2 = Stream.of("Abc" , "dd" , "ccc");
//        Map	<Boolean, List	<String>> p = s.collect(
//                Collectors.partitioningBy(b -> b.startsWith("c")));
//        Map<Boolean, List<String>> g = s2.collect(
//                Collectors.groupingBy(b -> b.startsWith("c")));
//        System.out.println(p + " " + g);


        Person p1= new Person("Navjot" , 1);
        Person p2 = p1;
        Person p3= new Person("Navjot" , 1);

        String str1 = "Navjot";
        String str2 = "vansh";
        System.out.println(p1==(p2));
        System.out.println(p1.equals(p1));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(p1.equals(p3));
        System.out.println(p1 == (p3));


    }
}
