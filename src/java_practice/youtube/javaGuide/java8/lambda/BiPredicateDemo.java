package java_practice.youtube.javaGuide.java8.lambda;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    /*
    * method boolean test(T t, U u) that takes 2 parameters T and U and returns boolean
    * */

    public static void main(String[] args) {
//        BiPredicate<String, String> biPredicate = new BiPredicateImpl();
//        boolean result = biPredicate.test("test", "bip");

        BiPredicate<String, String> biPredicate = (a, b)-> a.length()>b.length();
        boolean result = biPredicate.test("rest", "resting");
        System.out.println(result);

    }
}

class BiPredicateImpl implements BiPredicate<String, String>{

    @Override
    public boolean test(String s1, String s2){
        return s1.length() > s2.length();
    }
}
