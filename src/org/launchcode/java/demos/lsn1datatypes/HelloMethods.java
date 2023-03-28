package org.launchcode.java.demos.lsn1datatypes;

import javax.swing.*;
import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        System.out.println("Test");
        String inputWord = scanny.nextLine();

        String message = Message.getMessage("jp");
        System.out.println(message);
        System.out.println(inputWord);
        System.out.println("Enter a number");
        int number = scanny.nextInt();
        System.out.println(number);
    }

}
