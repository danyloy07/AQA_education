package lesson_2.if_else;

public class IfElse {
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
        ifElse();
    }
}
