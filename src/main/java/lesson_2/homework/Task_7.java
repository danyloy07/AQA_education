package lesson_2.homework;

import java.util.Arrays;

public class Task_7 {
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void main(String[] args) {
        int[] massive1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massive1.length; i++) {
            if (massive1[i]<6){
               massive1[i]= massive1[i] *2;
            }
        }
        System.out.println(Arrays.toString(massive1));
        }
    }

