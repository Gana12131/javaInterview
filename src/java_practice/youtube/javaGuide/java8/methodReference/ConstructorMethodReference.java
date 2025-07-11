package java_practice.youtube.javaGuide.java8.methodReference;

import java.util.*;
import java.util.function.Function;

public class ConstructorMethodReference {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "watermelon","mango", "banana");
        System.out.println(fruits);
        Function<List<String>, Set<String>> setFunction = f -> new HashSet<>(f);
        System.out.println(setFunction.apply(fruits));

        Function<List<String>, Set<String>> setFunction1 = HashSet::new;
        System.out.println(setFunction1.apply(fruits));

    }
}
