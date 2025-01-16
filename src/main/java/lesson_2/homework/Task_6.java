package lesson_2.homework;

import java.util.Arrays;

public class Task_6 {
    //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void main(String[] args) {
        int[] emptyMassive = new int[100];
        for (int i = 0; i < emptyMassive.length; i++) {
            emptyMassive[i]=i+1;
        }
        System.out.println(Arrays.toString(emptyMassive));
    }
}
