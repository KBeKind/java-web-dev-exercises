package org.launchcode.java.studios.areaofacircle;

public class ValidateRadius {
    public static boolean validate(String userInput){
        if (userInput == ""){
            return false;
        }

        try {
            Double.parseDouble(userInput);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
