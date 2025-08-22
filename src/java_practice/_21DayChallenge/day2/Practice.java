package java_practice._21DayChallenge.day2;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        //flatten the nested map
        List<Integer> list1 = Arrays.asList(1,3,6,9);
        List<Integer> list2 = Arrays.asList(11,14, 15);
        List<Integer> list3 = Arrays.asList(21,24, 25);
        List<List<Integer>> nestedList = Arrays.asList(list1, list2, list3);
        System.out.println(nestedList);
        List<Integer> flatMap = nestedList.stream().flatMap(List::stream).toList();
        System.out.println(flatMap);

        //Sort Map by Value in Descending Order
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 101);
        map.put("B", 104);
        map.put("C", 106);
        map.put("E", 100);
        map.put("D", 108);
        Map<String, Integer> desc = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)-> e1, LinkedHashMap::new));
        System.out.println(desc);


    }
}
