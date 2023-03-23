package exercises;

import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr =  {1, 1, 2, 3, 5, 8};
        System.out.println("All of the array:");
        for (int num: arr){
            System.out.println(num);
        }
        System.out.println("Only odd numbers:");
        for (int num: arr){
            if(num%2 != 0){
                System.out.println(num);
            }

        }


    }
}