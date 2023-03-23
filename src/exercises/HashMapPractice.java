package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {


        HashMap<Integer, String> studentHashMap = new HashMap<>();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the student information (or ENTER to finish):");

        String studentID;

        System.out.print("Student ID: ");

        while(true){
            studentID = input.nextLine();
            if(studentID.equals("")){
                break;
            }
            int studentIDInt = Integer.parseInt(studentID);

            System.out.print("Student Name: ");
            String studentName = input.nextLine();
            studentHashMap.put(studentIDInt, studentName);
            System.out.println(studentID + " " + studentName + " Data Entered.");
            System.out.println();

            System.out.print("Student ID: ");
        }


        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : studentHashMap.entrySet()) {
            System.out.println("ID: " + student.getKey() + "  Name: " + student.getValue());
        }


    }
    }

