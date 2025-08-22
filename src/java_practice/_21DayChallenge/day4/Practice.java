package java_practice._21DayChallenge.day4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        //Convert a list of strings into a single comma-separated string.

        List<String> items = Arrays.asList("A", "B", "C");

        String joinedStream = items.stream().collect(Collectors.joining(","));
        String joinedString = String.join(",", items);
        System.out.println(joinedStream);
        System.out.println(joinedString);

        //Avoid NullPointerException while fetching string length using Optional.
        String name = "Gana";
        String result = Optional.ofNullable(name).map(v->v.length()+" "+v).orElse(null);
        System.out.println(result);


    }
}
