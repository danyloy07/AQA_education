package lesson_2.random;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100)-50; // 100 — это разница между -50 и 50
        System.out.println(i);
    }
}
