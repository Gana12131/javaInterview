package java_practice._21DayChallenge.day12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7};
        System.out.println("missingNumber : "+ missingNumber(nums)); //issue with total sum
        System.out.println("missingNumber : "+ missingNumberStream(nums));

        int[] in = {1,2,0,3,0,5,6,7};
        System.out.println("moving zeros to end of given array " + Arrays.toString(moveZerosToEndOfArray(in)));

    }

    //missing number
    public static int missingNumber(int[] nums){
        int n=nums.length;
        int totalSum = n * (n+1)/2; //IntStream.rangeClosed(0, n).sum();
        int actualSum =0;
        for (int num: nums){
            actualSum += num;
        }
        return totalSum-actualSum;
    }

    public static int missingNumberStream(int[] nums){
        int min= Arrays.stream(nums).min().getAsInt();
        int max= Arrays.stream(nums).max().getAsInt();
        int totalSum = IntStream.rangeClosed(min, max).sum();
        int actualSum = Arrays.stream(nums).sum();
        return totalSum-actualSum;
    }

    public static int[] moveZerosToEndOfArray(int[] nums){
        int index =0;
        for(int num: nums){
            if(num !=0){
                nums[index++]=num;
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
        return nums;
    }
}
