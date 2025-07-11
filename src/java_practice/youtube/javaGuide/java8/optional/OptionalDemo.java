package java_practice.youtube.javaGuide.java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String email = "example@ex.com";

        //empty method
        Optional<String> optEmpty = Optional.empty();
        System.out.println("empty method: "+optEmpty); //prints Optional.empty

        Optional<String> of = Optional.of(email);
        System.out.println("of method: "+of);

        //Optional<String> of1 = Optional.of(null); //throws NullPointerException
        Optional<String> ofNull = Optional.ofNullable("clsss");
        System.out.println("ofNull method: "+ofNull);
        Optional<String> ofNull1 = Optional.ofNullable(null);
        System.out.println(ofNull1); //return empty optional object: Optional.empty
        //System.out.println(ofNull1.get()); //throws NoSuchElementException instead of NullPointerException

        if(ofNull1.isPresent()){
            System.out.println(ofNull1.get());
        } else {
            System.out.println("no value present");
        }

        String defaultValue = ofNull1.orElse("default");
        System.out.println("orElse method "+defaultValue); //returns default as ofNull1 object is null

        String orElseGetVale = ofNull1.orElseGet(()-> "default@value.com");
        System.out.println("method orElseGet: "+orElseGetVale);

        //String values = ofNull1.orElseThrow(()-> new IllegalArgumentException("no value found"));
        //throws IllegalArgumentException as ofNull1 is empty

        Optional<String> gender = Optional.of("MALE");
        Optional<String> empty = Optional.empty();

        gender.ifPresent(c->System.out.println("isPresent with consumer :value is present")); //it will get printed
        empty.ifPresent(c-> System.out.println("isPresent with consumer :no value present")); //it will be skipped

        String st = " abc ";
        Optional<String> optionalStr = Optional.of(st); //can be NullPointerException
        optionalStr.filter(r->r.contains("abc")).ifPresent(System.out::println);

        optionalStr.filter(r->r.contains("abc")).map(String::trim).ifPresent(System.out::println);//trims the spaces
















    }
}
