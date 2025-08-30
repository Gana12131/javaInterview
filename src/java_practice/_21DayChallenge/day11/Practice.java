package java_practice._21DayChallenge.day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        System.out.println("is palindrome " +isPalindrome("racecar"));
        System.out.println("is palindrome " +isPalindrome("racecars"));

        int[] nums = {2,7,11,15};
        int target =9;
        System.out.println("two sum "+ Arrays.toString(twoSum(nums, target)));

    }

    public static boolean isPalindrome(String str){
        int left =0, right=str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int[] twoSum(int [] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return new int []{};
    }

}
