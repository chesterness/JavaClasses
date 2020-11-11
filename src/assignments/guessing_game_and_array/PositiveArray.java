package assignments.guessing_game_and_array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PositiveArray {
    public static void main(String[] args){
        //Task2:
        //Given an array of positive numbers and a positive number ‘k’, find
        //the maximum sum of any contiguous subarray of size ‘k’.
        int[] positiveArray = {4,1,6,12,67,25,8,2,0,6,43};
        System.out.println("positiveArray length: " + positiveArray.length + "\npositiveArray values: " + Arrays.toString(positiveArray));
        int k = 4;
        int currentMax = 0;

        for(int firstIndex = 0; firstIndex <= positiveArray.length - k; firstIndex += k) {
            int secondIndex = firstIndex + k;
            System.out.println("firstIdex: " + firstIndex + " secondIndex: " + secondIndex);
            int[] subArray = Arrays.copyOfRange(positiveArray, firstIndex, secondIndex);
            System.out.println("subArray: " + Arrays.toString(subArray));
            int sumOfSubarray = IntStream.of(subArray).sum();
            System.out.println("sumOfSubarray: " + sumOfSubarray);
            if (sumOfSubarray>currentMax){
                currentMax = sumOfSubarray;
            }
        }
        System.out.println(currentMax);
    }
}
