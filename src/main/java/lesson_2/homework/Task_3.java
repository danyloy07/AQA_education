package lesson_2.homework;

import java.util.Random;

public class Task_3 {
    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    // отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.

    public static void returnTrueOrFalse(int num){
        String message = num >= 0? "false": "true";
        System.out.println(message);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(40)-20;

        System.out.println("Random number is: "+ randomNumber);
        returnTrueOrFalse(randomNumber);
    }
}
