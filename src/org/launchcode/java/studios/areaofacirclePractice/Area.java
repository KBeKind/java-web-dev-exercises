package org.launchcode.java.studios.areaofacirclePractice;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radiusDoub = 0;
        double area = 0;
        String radiusStr;
        Scanner input = new Scanner(System.in);
        do {
        System.out.println("Enter a radius: ");
        radiusStr = input.nextLine();
        if(ValidateRadiu.validateRadius(radiusStr)) {
            radiusDoub = Double.parseDouble(radiusStr);
        area = Circle.getArea(radiusDoub);

        } else {
            System.out.println("Error: Only a number is acceptable.");
            break;
        }
        if(radiusDoub <= 0){
            System.out.println("The radius must be a positive number.");
        }

    }while(radiusDoub <= 0);
        if (ValidateRadiu.validateRadius(radiusStr))System.out.println("The area of a circle of radius " + radiusStr + " is: " + area);
    }


}
