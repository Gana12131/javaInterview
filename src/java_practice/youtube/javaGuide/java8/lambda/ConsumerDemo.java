package java_practice.youtube.javaGuide.java8.lambda;

import java.util.function.Consumer;

public class ConsumerDemo {

    /*
    * method void accept(T t) method that takes T and returns nothing
    */

    public static void main(String[] args) {
//        Consumer<String> consumer = new ConsumerImpl();
//        consumer.accept("hello world");

        Consumer<String> consumer = i -> System.out.println("hello world");
//        Consumer<String> consumer = System.out::println;
        consumer.accept("hello world");
    }
}

class ConsumerImpl implements Consumer<String> {
    @Override
    public void accept(String str){
        System.out.println(str);
    }
}