import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "mom dad mom dad mom dd";
        System.out.println(str.chars());

        String[] ch=str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<ch.length; i++){
            int count =0;
            for(int j=0; j<ch.length; j++){
                if(ch[i].equals(ch[j])){
                    count++;
                }
                map.put(ch[i], count);
            }


        }

        Arrays.stream(ch);
        System.out.println(map);
        String s="null";
        ArrayList<String> list = new ArrayList<>();
        Map<Character, Long> mp = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mp);
    }
}
