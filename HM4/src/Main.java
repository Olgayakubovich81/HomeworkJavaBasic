import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        double n = sc.nextDouble();
        System.out.println("Введите m: ");
        double m = sc.nextDouble();
        double target = 10;
        if ((n-target) < (m-target)) {
            System.out.println("Число " + n + " ближе к " + target);
        } else  {
            System.out.println("Число " + m + " ближе к " + target);
        }
    }
}





