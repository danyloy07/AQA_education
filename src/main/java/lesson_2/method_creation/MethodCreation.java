package lesson_2.method_creation;

import java.util.Random;

public class MethodCreation {
//ничего не принимает и ничего не возвращает
    public static void helloWorld(){
        System.out.println("Hello World");
    }

    // Принимает аргумент и ничего не возвращает
    public static void withArguments(String text){
        System.out.println(text);
    }
    //ничего не принимает но возвращает значения
    public static int returnInt (){
        Random random = new Random();
        int randomInt = random.nextInt(50);
        return randomInt;
    }

    // Принимает аргумент и  возвращает значение
    public static int returnSomeNum (int num1, int num2){
        int summ = num1 + num2;
        return summ;
    }

    public static void main(String[] args) {
helloWorld();

withArguments("Какой-то текст");

int myRandomInt = returnInt();
        System.out.println(myRandomInt);

int summOfNum = returnSomeNum(2,4);
        System.out.println(summOfNum);

    }
}
