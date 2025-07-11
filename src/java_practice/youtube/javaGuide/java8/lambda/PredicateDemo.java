package java_practice.youtube.javaGuide.java8.lambda;

import java.util.function.Predicate;

public class PredicateDemo {

    /*
    * method boolean test(T t) that takes T and returns boolean
    */

    public static void main(String[] args) {

//        Predicate<String> predicate = new PredicateImpl();
//        boolean result= predicate.test("test");

        Predicate<String> predicate = p -> true;
        boolean result = predicate.test("str");

        System.out.println(result);
    }
}

class PredicateImpl implements Predicate<String> {

    @Override
    public boolean test(String str){
        return true;
    }
}
