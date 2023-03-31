package org.launchcode.java.studios.countingcharactersPractice;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
public class CountCharacters {

    public static void main(String[] args) {

        Scanner scanny = new Scanner(System.in);
        String stringToCount = "";
        System.out.println("** String Letter Counter ** \n Enter '1' to give your own string \n Enter '2' to use the file \n Enter '3' to use the default string");
        String userInputSelection = scanny.nextLine();

        while (!(userInputSelection.equals("1") || userInputSelection.equals("2") || userInputSelection.equals("3")) ) {
            System.out.println("The only acceptable input is '1', '2', or '3'.\n Enter '1' to give your own string \n Enter '2' to use the file \n Enter '3' to use the default string");
            userInputSelection = scanny.nextLine();
        }

        if (userInputSelection.equals("1")){
            System.out.println("Enter your string to count the characters:");
            stringToCount = scanny.nextLine();
            scanny.close();

        } else if (userInputSelection.equals("2")){
            scanny.close();
            Scanner scanFile = null;
            try {
                scanFile = new Scanner(new File("src/org/launchcode/java/studios/countingcharactersPractice/stringtocount.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
                while(scanFile.hasNextLine()) {
                    stringToCount = scanFile.nextLine();
                }
        } else if (userInputSelection.equals("3")){
            stringToCount = "If the product of two terms is zero then common sense says at least one of the two terms" +
                    " has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
                    " into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that," +
                    " it’s pretty straightforward from there.";
                    scanny.close();
        } else {
            System.out.println("Error:  How in the heck did this happen?  Somehow '1', '2', or '3' was not entered?!?");
            scanny.close();
        }

        char[] charArray = stringToCount.toUpperCase().toCharArray();

        Character[] letterArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        // OPTION TO USE ARRAYLIST AS WELL
//        ArrayList<Character> letterArrayList = new ArrayList<>(Arrays.asList(letterArray));

        HashMap<Character, Integer> charTotals = new HashMap<>();

        for (char i : charArray) {
            // OPTION FOR ARRAYLIST USE
//          if (letterArrayList.contains(i)){

            if ((Arrays.binarySearch(letterArray, i) > -1)){
                    if (charTotals.containsKey(i)){
                        charTotals.put(i, charTotals.get(i) + 1);
                    } else {
                        charTotals.put(i, 1);
                    }
                }
        }

        for (Map.Entry<Character, Integer> charTotal : charTotals.entrySet()) {
            System.out.println(charTotal.getKey() + ": " + charTotal.getValue());
        }

    }

}
