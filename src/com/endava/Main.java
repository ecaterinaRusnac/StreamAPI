package com.endava;

import com.endava.lambda.Factorial;
import com.endava.lambda.NoParams;
import com.endava.lambda.Operation;
import com.endava.lambda.PrintText;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        double val1 = 2.0, val2 = 2.0;

        // (parameters) -> (body) - lambda expression

//        Operation obj = new Operation() {
//            @Override
//            public int getResult(int v1, int v2) {
//                return v1 + v2;
//            }
//        };

//        Operation operation = (v1, v2) -> (v1 + v2);
//        System.out.println(operation.getResult(5, 5));

        //-----------------------------------//

//        PrintText printText = (str) -> System.out.println(str);
//        printText.print("Hello");

        //-----------------------------------//

//        Factorial factorial = val -> {
//            int result = 1;
//            for (int i = 1; i <= val; i++) {
//                result *= i;
//            }
//            return result;
//        };
//        System.out.println(factorial.getFactorial(5));

        //-----------------------------------//

//        NoParams noParams = () -> {
//            return val1 + val2;
//        };
//        System.out.println(noParams.getResult());

        //TO DO: check
//        Runnable runnable = () -> {
//            return val1 + val2;
//        };
//        System.out.println(runnable.run());

        //-----------------------------------//
        // list.forEach(n -> System.out.println(n));
        // list.forEach(System.out::println);


        //-----------------------------------////-----------------------------------//

        Collection<Intern> interns = Arrays.asList(
                new Intern("Max", 18, InternStream.JAVA),
                new Intern("Petr", 23, InternStream.MOBILE),
                new Intern("Elena", 30, InternStream.L2),
                new Intern("Kristina", 18, InternStream.L2),
                new Intern("Mr Brown", 59, InternStream.DEVOPS)
        );

//        List<Intern> l2Interns = interns.stream().filter(it -> it.getInternStream() == InternStream.L2 &&
//                it.getAge() > 20).collect(Collectors.toList());
//        System.out.println("L2 interns:" + l2Interns);

//        double averageAge = interns.stream().mapToInt(Intern::getAge).average().getAsDouble();
//        System.out.println("Average age: " + averageAge);

//        Integer max = interns.stream().mapToInt(Intern::getAge).max().getAsInt();
//        System.out.println("Max age: " + max);

//        String max = interns.stream().max(Comparator.comparing(Intern::getName)).toString();
//        System.out.println("Max name: " + max);

//        List<String> list1 = Arrays.asList("s1", "s2", "s3");
//        List<Boolean> list2 = Arrays.asList(true, false, true);
//        List<String> list = IntStream.range(0, list1.size())
//                .filter(it -> list2.get(it))
//                .mapToObj(it -> list1.get(it))
//                .collect(Collectors.toList());
//        System.out.println(list);

        List<String> list1 = Arrays.asList("s1", "s2", "s3");
        List<Integer> list2 = Arrays.asList(1, 3, 2);
        List<String> list = IntStream.range(0, list1.size())
                .filter(it -> list2.get(it) % 2 != 0)
                .mapToObj(it -> list1.get(it))
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
