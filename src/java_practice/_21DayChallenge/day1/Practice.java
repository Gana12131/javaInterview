package java_practice._21DayChallenge.day1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {

    public static void main(String[] args) {

        String str = "aabbbcdddd";

        //find first non-repeating character in a string
        Character nonRepeatChar = str.chars().mapToObj(s->(char)s)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(f->f.getValue()==1).map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println(nonRepeatChar);

        List<String> list = Arrays.asList("Gana", "Mouni","Bujji","Bujji");

        //first non-repeating string in a list
        String nonRepeatStr = list.stream().collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().map(Map.Entry::getKey).findFirst().orElse("no such element");
        System.out.println(nonRepeatStr);

        //find if it is prime number
        int num = 18;
        boolean isPrime = num>1 && IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i->num %i==0);
        System.out.println(isPrime);


    }
}
