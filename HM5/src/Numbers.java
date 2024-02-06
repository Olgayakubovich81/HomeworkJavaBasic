import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        System.out.println("Введите еще одно число");
        int b = sc.nextInt();
        System.out.println("Введите еще одно число");
        int c = sc.nextInt();


        if (a > b && a > c) {
            System.out.println ("Максимум: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Максимум: " + b);
        } else {
            System.out.println("Максимум: " + c);

        }
    }
}
