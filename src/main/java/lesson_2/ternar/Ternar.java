package lesson_2.ternar;

import java.util.Scanner;

public class Ternar {
    //вложеннй тернарный оператор
    public static void ternarExample(){
        Scanner ternarScanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = ternarScanner.nextInt();
        String message = age <18 ? "you are less than 18" : age > 30 ? "You are more than 30":"You are beetwen 18 and 30";
        System.out.println(message);
        ternarScanner.close();
    }

    public static void main(String[] args) {
        ternarExample();
    }
}
