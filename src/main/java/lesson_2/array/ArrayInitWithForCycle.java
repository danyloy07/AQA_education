package lesson_2.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayInitWithForCycle {
    public static void main(String[] args) {
            int[] arrayInt = new int[5];
        System.out.println(arrayInt.length);

        for (int i = 0; i<arrayInt.length; i++){
            arrayInt[i] = (i+1) *10;
            System.out.println(arrayInt[i]);
        }
        System.out.println(Arrays.toString(arrayInt));

        // заполение масива рандомным значением
        Random randomizer = new Random();
//        int randomInt = randomizer.nextInt(100)-50; // если оставить эту строчку кода, то выбирается 1 число и оно засовуется в массив , во все ячейки

        int[] arrayInt2= new int[10];
        for (int i = 0; i < arrayInt2.length ; i++) {
            arrayInt2[i] = randomizer.nextInt(100)-50;
        }
        System.out.println(Arrays.toString(arrayInt2));
    }
}
