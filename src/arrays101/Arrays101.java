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
            System.out.println("Enter next number: ");
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

    public static void main(String[] args) {
        int[] numbers = new int[HowManyTimes("How many numbers do you want to store? ")];

        FillArray(numbers);

        System.out.println("Original array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        BubbleSortArray(numbers);

        System.out.println("Sorted array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Sum: "+SumTotalOfArray(numbers));
        System.out.println("Product: "+ProductOfArray(numbers));
        System.out.println("Largest: "+numbers[0]);
        System.out.println("Smallest: "+numbers[numbers.length-1]);
        
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
