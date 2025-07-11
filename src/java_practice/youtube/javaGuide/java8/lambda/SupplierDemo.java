package java_practice.youtube.javaGuide.java8.lambda;

import java.util.function.Supplier;

public class SupplierDemo {

    /*
    * method T get() that takes nothing and returns T
    */
    public static void main(String[] args) {

//        Supplier<String> supplier =  new SupplierImpl();
//        String result = supplier.get();

        Supplier<String> supplier = ()-> "supplier returns";
        String result = supplier.get();
        System.out.println(result);

    }
}

class SupplierImpl implements Supplier<String>{
    @Override
    public String get(){
        return "returning get method";
    }
}