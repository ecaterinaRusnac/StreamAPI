package com.endava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UseStream {
    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("a1", "a2", "a1", "b2", "c1");
        Collection<Integer> collectionInt = Arrays.asList(1, 2, 3, 4, 5);

//        long count = collection.stream().filter((it) -> it.equals("a1")).count();
//        System.out.println("count: " + count);

//        List<String> select = collection.stream().filter(s -> s.contains("1")).collect(Collectors.toList());
//        System.out.println(select);

//        String last = collection.stream().skip(collection.size() - 1).findAny().orElse("1");
//        System.out.println("last: " + last);

//        String last = collection.stream().skip(3).findFirst().get();
//        System.out.println("last: " + last);

        List<String> alpha = Arrays.asList("a", "b", "c");
        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s: alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        //After Java8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }

}
