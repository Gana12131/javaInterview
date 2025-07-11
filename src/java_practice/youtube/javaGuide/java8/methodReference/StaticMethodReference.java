package java_practice.youtube.javaGuide.java8.methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StaticMethodReference {

    public static void main(String... args){
        Function<Integer, Double> function = i -> Math.sqrt(i);
        System.out.println(function.apply(25));

        Function<Integer, Double> function1 = Math::sqrt;
        System.out.println(function1.apply(36));

        BiFunction<Integer,Integer, Integer> biFunc = (a, b)-> StaticMethodReference.addition(a,b);
        System.out.println(biFunc.apply(4,7));

        BiFunction<Integer, Integer, Integer> biFunc1 = StaticMethodReference::addition;
        System.out.println(biFunc1.apply(8,7));
    }

    public static int addition(int a, int b){
        return a+b;
    }
}
