package lesson_2.array;

import java.util.Arrays;

public class Array {
    public static void array(){
        int [] array = new int[8];
        int [] array2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        String [] newString = new String[7];
        String [] newString2 = {"One", "Two"};
        System.out.println(Arrays.toString(newString));
        System.out.println(Arrays.toString(newString2));
    }

    public static void main(String[] args) {
        array();
    }
}
