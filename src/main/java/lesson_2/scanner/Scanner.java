

public class Scanner {
    public static void scanner() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter some text: ");
        String text = scanner.next(); // там где просто next, то там береться только 1 значение введенное юзером
        System.out.println(text);
    }

    public static void main(String[] args) {
        scanner();
    }
}
