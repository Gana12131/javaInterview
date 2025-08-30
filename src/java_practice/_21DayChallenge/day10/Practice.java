package java_practice._21DayChallenge.day10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        //using string builder class
        System.out.println(Practice.reverseString("Reverse"));
        System.out.println(Practice.reverseStringLogic("reversing"));

        //find max num in array
        int [] nums = {1,4,5,6,7,3};
        System.out.println(Practice.maxNum(nums));
        System.out.println(maxNumStream(Arrays.asList(1,5,2,4,9,5,7)));

        secondMaxNum(nums);

    }

    public static String reverseString(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static String reverseStringLogic(String input){
        char[] ch = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=ch.length-1; i>=0; i--){
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static int maxNum(int [] numbers){
        int max=0;
        for(int num: numbers){
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    public static int maxNumStream(List<Integer> numbers){
        // numbers.stream().max(Integer::compareTo).orElse(0);
        // numbers.stream().max((e1, e2)-> e2-e1).orElse(0);
        return numbers.stream().max(Comparator.naturalOrder()).orElse(0);
    }

    public static void secondMaxNum(int [] numbers) {
        int max=0;
        int secondMax=0;
        for(int num: numbers){
            if(num>max){
                secondMax=max;
                max=num;
            } else if(num>secondMax && num != max){
                secondMax=num;
            }
        }
        System.out.println("secondMax : "+secondMax);
        System.out.println("max : "+max);
    }
}
