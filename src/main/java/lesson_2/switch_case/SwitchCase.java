package lesson_2.switch_case;

import java.util.Scanner;

public class SwitchCase {
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

    public static void main(String[] args) {
        switchCase();
    }
}
