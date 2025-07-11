package java_practice.youtube.javaGuide.java8.lambda;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    /*
    * method void accept(T t, U u) takes 2 parameters and returns nothing
    * */

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b)-> System.out.print(a+b);
        biConsumer.accept("test", "print");
    }
}
