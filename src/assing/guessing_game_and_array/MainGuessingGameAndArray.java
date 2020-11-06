package assing.guessing_game_and_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MainGuessingGameAndArray {
    public static void main(String[] args) {
        //Tasks from lesson 5.11.2020.
        //Task1: Create a guessing game:
        //1. User types a number 2. program prints out "correct" or "not correct"
        //depending on the number entered 3. if the number is not correct, program
        //promts the input again 4. go to 1.
        //Hints:
        //1. Create a variable and assign a value to it.
        //2. Read user's input using Scanner.
        //3. Using "if" statement check if the number is correct or not.
        //4. Use while loop to repeat asking for a number.
        //5. Exit criteria would be a correct number.

        int rightNumber = 0;
        while(!(rightNumber==7)){
            System.out.println("Guess a number from 0 to 10! Input it below:");
            Scanner scnr = new Scanner(System.in);
            int read = scnr.nextInt();
            if(read == 7){
                System.out.println("Correct! The number is 7!");
                rightNumber = read;
            } else {
                System.out.println("Incorrect, try again");
            }
        }

        //Task2:
        //Given an array of positive numbers and a positive number ‘k’, find
        //the maximum sum of any contiguous subarray of size ‘k’.
        int[] positiveArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("positiveArray length: " + positiveArray.length + "\npositiveArray values: " + Arrays.toString(positiveArray));
        int k = 4;
        Integer currentMax = 0;//variable wrapped in Integer object because otherwise it's not changed during the loop

        for(int firstIndex = 0; firstIndex <= positiveArray.length - k; firstIndex += k) {
            int secondIndex = firstIndex + k;
//            System.out.println("firstIdex: " + firstIndex + " secondIndex: " + secondIndex);
            int[] subArray = Arrays.copyOfRange(positiveArray, firstIndex, secondIndex);
//            System.out.println("subArray: " + Arrays.toString(subArray));
            int sumOfSubarray = IntStream.of(subArray).sum();
//            System.out.println("sumOfSubarray: " + sumOfSubarray);
            if (sumOfSubarray>currentMax){
                currentMax = sumOfSubarray;
            }
        }
        System.out.println(currentMax);
    }
}

