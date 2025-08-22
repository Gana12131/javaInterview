package java_practice.youtube.javaGuide.java8.streamApi;

import java.util.*;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C");
        stream.forEach(System.out::println);
        //stream.forEach(s->System.out.println(s));

        //converting collection to stream
        Collection<String> collection = Arrays.asList("banana", "apple", "orange", "pomegranate");
        Stream<String> collectionStream = collection.stream();
        collectionStream.forEach(System.out::println);

        //converting list to stream
        List<String> list = Arrays.asList("banana", "apple", "orange", "pomegranate");
        Stream<String> listStream = list.stream();
        listStream.forEach(System.out::println);

        //converting set to stream
        Set<String> set = new HashSet<>();
        set.add("banana");
        Stream<String> setStream = set.stream();
        setStream.forEach(System.out::println);

        String[] array = {"a", "b", "c"};
        Stream<String> arrayStream = Arrays.stream(array);
        arrayStream.forEach(System.out::println);










    }
}
