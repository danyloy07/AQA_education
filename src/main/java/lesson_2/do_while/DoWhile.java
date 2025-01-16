package lesson_2.do_while;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int countOfPhoto = 0;
        Scanner scanner = new Scanner(System.in);
        while(countOfPhoto<=100) {
            if (countOfPhoto == 100){
                break;
            }
            System.out.println("How much photo you want do download? ");
            int tempPhoto = scanner.nextInt();
            if ((countOfPhoto + tempPhoto) >100){
                System.out.println("The limit is reached");
                System.out.println("You can load " + (100 - countOfPhoto));
                continue;
            }
            countOfPhoto = countOfPhoto + tempPhoto;
            System.out.println("You can load " + (100 - countOfPhoto));
        }
        System.out.println("Final");


        //do while
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ENTER number:");
        int num = scanner1.nextInt();
        while (num<0){
            System.out.println("from while");
            System.out.println(num);
        }

        do {
            System.out.println("From do while");
            System.out.println(num);
        }while (num<0);
    }
}
