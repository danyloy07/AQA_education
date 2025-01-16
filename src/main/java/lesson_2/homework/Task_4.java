package lesson_2.homework;

import java.util.Random;

public class Task_4 {
    //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    // указанную строку, указанное количество раз;

    public static void stringAndInt(int num, String string){
//        int i = 1;
//        while (i<=num){
//            System.out.println(string + " - " + i);
//            i++;
        for (int i = 1; i <= num; i++) {
            System.out.println(string + " - " +i);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = random.nextInt(20);

        System.out.println("Random value is : "+randomValue);
        stringAndInt(randomValue, "Hello world");
    }
}



