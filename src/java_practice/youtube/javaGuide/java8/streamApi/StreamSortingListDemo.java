package java_practice.youtube.javaGuide.java8.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingListDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,3,6,9,3,7,1);
        list.stream().sorted().forEach(System.out::println);

        //natural sorting
        List<String> list1 = Arrays.asList("sri", "bujji", "mona", "bujjamma");
        list1.stream().sorted().forEach(System.out::println);

        //sorting ascending and descending order
        list1.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //sorting using compare to method
        list1.stream().sorted(String::compareTo).forEach(System.out::println);
        list.stream().sorted(Integer::compareTo).forEach(System.out::println);

        //sorting using custom compare to method
        list1.stream().sorted((o1,o2)->o1.compareTo(o2)).forEach(System.out::println);
        list1.stream().sorted((o1,o2)-> o2.compareTo(o1)).forEach(System.out::println);
        List<Product> productList = StreamFilterDemo.getProducts();
        List<Product> sorted = productList.stream().sorted(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        }).toList();

        List<Product> sorted1 = productList.stream().sorted((o1,o2)-> (int) (o1.getPrice() - o2.getPrice())).toList();

//        List<Product> sorted2 = productList.stream().sorted((Comparator.comparingLong(Product::getPrice)

    }
}
