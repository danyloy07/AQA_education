package lesson_2;

import java.util.Scanner;

public class Lesson_2 {
    public static void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String text = scanner.next(); // там где просто next, то там береться только 1 значение введенное юзером
        System.out.println(text);
    }

    // Вложенный switch case
    public static void switchCase(){
        Scanner scannerCar = new Scanner(System.in);
        System.out.println("Enter car name ");
        String car = scannerCar.nextLine();

        switch (car.toLowerCase()){
            case("audi"):
                System.out.println("No Audi");
                break;
            case ("mers"):
                System.out.println("No mers");
                break;
            case ("bmw"):
            case("volvo"):
                System.out.println("Nice car");
                Scanner scannerEngine = new Scanner(System.in);
                System.out.println("Enter your engine: ");
                String engine = scannerEngine.nextLine();
                switch (engine.toUpperCase()){
                    case ("2.0"):
                        System.out.println("ne edet");
                        break;
                    case ("3.0"):
                        System.out.println("Edet");
                        break;
                    default:
                        System.out.println("No found engine");
                        break;
            } break;
            default:
                System.out.println("No found CAR");
                break;
        }
    }

    // попробую сделать вложенный if else
    public static void ifElse(){
        int a = 3;
        int b = 2;
        if (a>b){
            if (b==8){
                System.out.println("b==8");
            } else if (a==7) {
                System.out.println("a==7");
            }else {
                System.out.println("a>b");
            }
        }else {
            System.out.println("a<b");
        }
    }

    public static void main(String[] args) {
        scanner();
        switchCase();
        ifElse();
    }
}

