package java_practice._21DayChallenge.day3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {


    public static void main(String[] args) {

        //Find all elements that appear more than once in a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
        List<Integer> dup = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(f->f.getValue()>1).map(Map.Entry::getKey).toList();
        System.out.println(dup);

        //Sum of Squares of Even Numbers
        Integer sum = numbers.stream()
                .filter(i -> i % 2 == 0).map(m -> m * m).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
