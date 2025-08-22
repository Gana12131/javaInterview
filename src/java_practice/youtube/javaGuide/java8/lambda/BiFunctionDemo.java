package java_practice.youtube.javaGuide.java8.lambda;

import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BiFunctionDemo {
    /*
    * method R apply(T t, U u) that takes T, U parameters and returns R
    * */

    public static void main(String[] args) {
        BiFunction<String, String, String> biPredicate = (a, b)-> a+b;
        String result =biPredicate.apply("test ", "engine");
        System.out.println(result);
        String str = "mom dad mom dad mom mom dad dd ff";
        Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> map1 =map.entrySet().stream()
                .filter(m->m.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map1);

    }
}



