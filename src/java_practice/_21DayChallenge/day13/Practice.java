package java_practice._21DayChallenge.day13;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        int[] nums={1,4,2,5,7,4};
        System.out.println("rotate an array by k elements "+ Arrays.toString(rotateArray(nums, 4)));

        System.out.println("non repeating character in a given string "+uniqueCharInString("aabbcdd"));
        System.out.println("non repeating character in a given string using stream "+uniqueCharInStringStream("aabbcdd"));

    }

    public static int[] rotateArray(int[] nums, int k){
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        return nums;
    }

    private static void reverse(int [] nums, int start, int end){
        while(start<end) {
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            end--;
            start++;
        }
    }

    public static Character uniqueCharInString(String word){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : word.toCharArray()) {
            int count =1;
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            } else {
                count++;
                map.put(ch, count);
            }
        }

        for(Map.Entry<Character, Integer> unique: map.entrySet()){
            if(unique.getValue()==1){
                return unique.getKey();
            }
        }
        return null;
    }

    public static Character uniqueCharInStringStream(String word){
        return word.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(a -> a.getValue() == 1).map(a->a.getKey()).findFirst().orElse('A');
    }
}
