/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays101;

import java.util.Scanner;

/**
 *
 * @author lefty
 */
public class Arrays101 {

    /**
     * @param args the command line arguments
     */
    public static int HowManyTimes(String message) {
        int ret = 0;
        System.out.print(message + " ");
        ret = GetIntFromKeyboard();
        return ret;
    }

    public static int GetIntFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);
        int ret = keyboard.nextInt();
        return ret;
    }

    public static int[] FillArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = GetIntFromKeyboard();
//            System.out.println(array[i]);
        }
        return array;
    }

    public static int SumTotalOfArray(int[] array) {
        int ret = 0;
        for (int element : array) {
            ret = ret + element;
        }
        return ret;
    }

    public static int ProductOfArray(int[] array) {
//int vs double as return value!!!
// probably not a good idea        
        int ret = 1;
        for (int i = 0; i < array.length; i++) {
            ret = ret * array[i];
        }
        return ret;
    }

    public static int[] BubbleSortArray(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

    public static boolean IsNumberInArray(int number, int[] array) {
        BubbleSortArray(array);
        int half = 0;
        if (array.length > 1) {
            half = (int) array.length / 2;
        }

        if (half > 0 && array[half] > number) {
            System.out.println("less than the number in the middle");
            IsNumberInArray(number, SubArray(half, array.length, array));
        }

        if (half > 0 && array[half] < number) {
            System.out.println("larger than the number in the middle");
            IsNumberInArray(number, SubArray(0, half, array));
        }

        if (array[half] == number) {
            System.out.println("it is the number in the middle");
            System.out.println("Returning True");
            return true;
        } 
        if (array[0] == number) {
            System.out.println("it is the number in the middle");
            System.out.println("Returning True");
            return true;
        } else {
            System.out.println("Returing FALSE");
            return false;
        }
    }

    public static int[] SubArray(int start_index, int last_index, int[] array) {
        BubbleSortArray(array);

        int[] new_array = new int[last_index - start_index];

        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = array[start_index + i];
        }

        return new_array;
    }

    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("_____________");
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] numbers = new int[HowManyTimes("How many numbers do you want to store? ")];

        FillArray(numbers);

        System.out.println("Original array");
        IsNumberInArray(8, numbers);

//        IsNumberInArray(23,numbers);
//       BubbleSortArray(numbers);
//
//        System.out.println("Sorted array");
//      PrintArray(numbers);  
//        System.out.println("Sum: "+SumTotalOfArray(numbers));
//        System.out.println("Product: "+ProductOfArray(numbers));
//        System.out.println("Largest: "+numbers[0]);
//        System.out.println("Smallest: "+numbers[numbers.length-1]);
//        
//        
//        
//        int[] array_ = new int [5];
//        array_[0]= 2  ;
//        array_[1]= 5   ;
//        array_[2]= 6  ;
//        array_[3]= 7  ;
//        array_[4]= 8  ;
//        
//        int x = SumTotalFromArray(array_);
//        System.out.println(x);
    }

}
