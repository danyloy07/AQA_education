package lesson_2.homework;
import java.util.Random;

    public class Task_1 {
        //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
        // (включительно), если да – вернуть true, в противном случае – false.

        public static void number(int num1, int num2) {
            int sum = num1 + num2;
            String isSum = sum >= 10 && sum <= 20? "true": "false";
            System.out.println(isSum);
        }

        public static void main(String[] args) {
            Random random = new Random();
            int randomNum1 = random.nextInt(51);
            int randomNum2 = random.nextInt(51);

            System.out.println("Первое случайное число: " + randomNum1);
            System.out.println("Второе случайное число: " + randomNum2);
            number(randomNum1, randomNum2);
        }
    }

