package java_practice.youtube.javaGuide.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionDemo {
    /*
    * method R apply(T t, U u) that takes T, U parameters and returns R
    * */

    public static void main(String[] args) {
        BiFunction<String, String, String> biPredicate = (a, b)-> a+b;
        String result =biPredicate.apply("test ", "engine");
        System.out.println(result);

    }
}



