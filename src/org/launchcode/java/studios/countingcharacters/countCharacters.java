package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
public class countCharacters {

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
            stringToCount = userInputString(scanny);

        } else if (userInputSelection.equals("2")){

                scanny.close();
                Scanner scanFile = null;
                try {
                    scanFile = new Scanner(new File("src/org/launchcode/java/studios/countingcharacters/stringtocount.txt"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                while (scanFile.hasNextLine()) {
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

        HashMap<Character, Integer> charTotals = new HashMap<>();

        for(char i : charArray){
            if(Character.isLetter(i)) {
                if (charTotals.containsKey(i)) {
                    charTotals.replace(i, charTotals.get(i) + 1);
                } else {
                    charTotals.put(i, 1);
                }
            }

        }
        for (Map.Entry<Character, Integer> student : charTotals.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }


    }

    private static String userInputString (Scanner scannerObject) {
        System.out.println("Enter your string to count the characters:");
         String stringInput = scannerObject.nextLine();
         scannerObject.close();
         addStringToFile(stringInput);
         return stringInput;
    }

    private static void addStringToFile(String userString){
        String filePath = "src/org/launchcode/java/studios/countingcharacters/stringtocount2.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(userString);
            System.out.println("String also added to 'stringtocount2.txt' for no charge even :D");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

    }

}
