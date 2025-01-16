package lesson_2.homework;

import java.util.Arrays;

public class Task_5 {
    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void main(String[] args) {
        int[] massive = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < massive.length; i++) {
            if (massive[i]==0){
                massive[i]=1;
            }else {
                massive[i]=0;
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
