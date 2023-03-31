package org.launchcode.java.studios.areaofacircle;

public class ValidateRadius {
    public static boolean validate(String userInput){
        if (userInput.equals("")){
            return false;
        } else {


        try {
            Double.parseDouble(userInput);
        } catch (NumberFormatException e) {
           return false;
        }
        return true;
    }}

}

