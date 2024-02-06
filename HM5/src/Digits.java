import java.util.Scanner;


    public class Digits {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите натуральное число: ");
            String num = scanner.nextLine();

            int sum = 0;

            for (int i = 0; i < num.length(); i++) {
                char dig = num.charAt(i);
                sum = sum + Character.getNumericValue(dig);


            }

            System.out.println("Сумма всех цифр в числе " + num + " равна " + sum);
        }
    }


