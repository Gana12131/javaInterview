package java_practice.youtube.javaGuide.java8.methodReference;

import java.util.Arrays;
import java.util.function.Function;

public class ArbitraryMethodReference {

    public static void main(String[] args) {

        Function<String, String> function=i-> i.toLowerCase();
        System.out.println(function.apply("This is Text"));

        Function<String, String> function1 = String::toLowerCase;
        System.out.println(function1.apply("This is Arbitrary Method Reference"));

        String[] strArray ={"B", "A","Z", "t", "w", "b","t", "g"};
        Arrays.sort(strArray, (s1, s2)-> s1.compareTo(s2));
        System.out.println(Arrays.toString(strArray));
        Arrays.sort(strArray, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strArray));
    }
}
