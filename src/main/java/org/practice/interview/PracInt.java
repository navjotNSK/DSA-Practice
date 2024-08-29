package org.practice.interview;

import java.util.*;
import java.util.stream.Collectors;

public class PracInt {



    public static List<String> getFemaleMiddleNamesInUpperCase(List<Person> people) {
        return Optional.ofNullable(people).orElse(new ArrayList<>()).stream()
                .filter(person -> person.gender == Gender.FEMALE)
                .map(Person::getMiddleName)
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args){
        List<String> filterdList = getFemaleMiddleNamesInUpperCase(Arrays.asList(new Person("Navjot","Singh",25,Gender.FEMALE), new Person("Navjot",null,25,Gender.MALE)));
        filterdList.forEach(m-> System.out.println(m));

    }
}
