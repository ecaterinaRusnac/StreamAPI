package com.endava;

import com.endava.lambda.Factorial;
import com.endava.lambda.NoParams;
import com.endava.lambda.Operation;
import com.endava.lambda.PrintText;

import java.util.PrimitiveIterator;

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


    }
}
