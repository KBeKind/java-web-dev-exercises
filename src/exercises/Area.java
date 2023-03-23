package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle Length:");
        Integer length = input.nextInt();

        System.out.println("Rectangle Width:");
        Integer width = input.nextInt();

        int area = width * length;

        System.out.println("Rectangle Area is: " + area);
    }
}