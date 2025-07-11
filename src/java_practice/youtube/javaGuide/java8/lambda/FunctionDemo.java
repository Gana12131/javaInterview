package java_practice.youtube.javaGuide.java8.lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        /*
        * method R apply(T t) that takes T and return R
        */

//        Function<String, String> function =new FunctionImpl();
//        String str = function.apply("func");

        Function<String, String> function = s -> s;
        String str = function.apply("func");

        System.out.println(str);
    }
}

class FunctionImpl implements Function<String, String>{
    @Override
    public String apply(String str){
        return str;
    }
}
