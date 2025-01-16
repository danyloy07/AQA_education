package lesson_2.for_each;

import java.util.Arrays;
import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        int[] arrayInt2= {10, 20, 30, 40, 50};

        for (int number: arrayInt2){
            System.out.print(number + ", ");
        }
        System.out.println();

        // for + for each
        Random random = new Random();
        int[] arrayInt3 = new int[5];
        for (int i = 0; i <arrayInt3.length ; i++) {
            arrayInt3[i] = random.nextInt(30);
        }
        for (int num1:arrayInt3){
            System.out.print(num1 + ", ");
        }
        System.out.println();
    }
}

