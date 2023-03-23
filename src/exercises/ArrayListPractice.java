package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
                add(10);
            }
        };

        System.out.println(sumEvenNum(arrList));

        ArrayList<String> wordArrayList = new ArrayList<>() {{

            add("12345");
            add("1234");
            add("123456");
            add("12345");
            add("12345");
            add("1234");
            add("12345");
            add("12345");
            add("1234");
            add("123456");
            add("12345");
        }};

        fiveLetterWords(wordArrayList);


        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArray = sentence.split(" ");
        ArrayList<String> wordArrayList2 = new ArrayList<>(Arrays.asList(sentenceArray));

        fiveLetterWords(wordArrayList2);


    }

    public static int sumEvenNum(ArrayList<Integer> listArr){
        int total = 0;

        for(int num: listArr){
            if(num % 2 == 0) {
                total += num;
            }
        }

        return total;
    }

    public static void fiveLetterWords(ArrayList<String> listArr){
        System.out.println("Enter the number of letters to search: ");
        Scanner input = new Scanner(System.in);
        int searchLength = input.nextInt();
        for(String word: listArr){
            if(word.length() == searchLength) {
                System.out.println(word);
            }
        }
    }

}
