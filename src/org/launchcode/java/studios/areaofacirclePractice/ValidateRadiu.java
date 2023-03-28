package org.launchcode.java.studios.areaofacirclePractice;


public class ValidateRadiu {

    public static boolean validateRadius(String userInput){
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



