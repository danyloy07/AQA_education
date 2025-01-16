package lesson_2.homework;

import java.util.Random;

public class Task_2 {
    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void checkNum(int num){
        String message = num >= 0? "The number is positive":"The number is negative";
        System.out.println(message);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(30)-20;

        System.out.println("Random number is: "+randomNum);
        checkNum(randomNum);
    }
}
