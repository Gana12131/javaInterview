package java8Practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Features {

    public static void main(String[] args) {

        firstNonRepeatedCharacter("dfdfdvdveescg");
        groupWords("mom dad mom dad mom mom dvd kddj mom ");
        isPrime(10);
    }

    //find first non-repeated character in a string
    public static void firstNonRepeatedCharacter(String name){
        Character character = name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(character);
    }

    //group words
    public static void groupWords(String name){
        // if input is a list then can use list.stream() instead of Arrays.stream(name.split(" "))
        Map<String, Long> wordMap= Arrays.stream(name.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordMap);
    }

    //check if number is prime
    public static void isPrime(int num){
        boolean isPrime= IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i->num%i==0);
        System.out.println(num +" is prime: "+ isPrime);

    }
}
