package com.endava.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //from collection
//        Collection<String> collection = Arrays.asList("a", "b", "c");
//        Stream<String> streamFromCollection = collection.stream();
////        System.out.println(streamFromCollection);
//        System.out.println(streamFromCollection.collect(Collectors.toList()));

        //-------from values----------/
//        Stream<String> streamFromValues = Stream.of("a", "b", "c");
//        System.out.println(streamFromValues.collect(Collectors.toList()));

        //-------from array----------/
//        String[] array = {"a", "b", "c"};
//        Stream<String> streamFromArray = Arrays.stream(array);
//        System.out.println(streamFromArray.collect(Collectors.toList()));

        //-------from file----------/
        //some code
//        try {
//            Stream<String> streamFromFile = Files.lines(Paths.get("/file.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //-------from line----------/
//        IntStream streamFromLine = "12345".chars();

//        Stream.builder().add("a").add("c").build();

        //parallel streams//
//        Collection<String> collection = Arrays.asList("a", "b", "c");
//        Stream<String> stringStream = collection.parallelStream(); //1
//        stringStream.parallel(); //2
    }
}
