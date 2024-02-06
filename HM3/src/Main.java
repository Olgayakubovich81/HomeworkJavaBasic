import java.util.Scanner;

public class Main {

               public static void main(String[] args) {
                   Scanner sc = new Scanner(System.in);
                  System.out.println("Введите слово");
                   String word1 = sc.nextLine();
                   System.out.println("Введите еще одно слово");

                String word2 = sc.nextLine ();
                int length1 = word1.length();
                int length2 = word2.length();
                String word1FirstHalf = word1.substring(0, length1/2);
                String word2SecondHalf = word2.substring(length2/2);


                if (word1.length()%2==0 && word2.length()%2==0)
                {

                System.out.println("Вы ввели " + word1FirstHalf +word2SecondHalf);
            }
                else {
                    System.out.println("Вы ввели слова с нечетным колличеством букв");
                }}}



//public class Main {
//
//    public static void main(String[] args) {
//        int num1 = 5;
//        int num2 = 1;
//
//        System.out.println("Void method: " + (num1 + num2));
//        System.out.println("Void method: " + (num1 - num2));
//        System.out.println("Void method: " + (num1 * num2));
//        System.out.println("Void method: " + (num1 / num2));
//
//
//        Maths maths = new Maths();
//        maths.getSum(num1, num2);
//        maths.getMinus(num1, num2);
//        maths.getMultiply(num1, num2);
//        maths.getDivision(num1, num2);
//
//        int resultSum = maths.getSum(num1, num2);
//        int resultMinus= maths.getMinus(num1, num2);
//        int resultMultiply= maths.getMultiply(num1, num2);
//        int resultDivision= maths.getDivision(num1, num2);
//
//
//        System.out.println("Return method: " + resultSum);
//        System.out.println("Return method: " + resultMinus);
//        System.out.println("Return method: " + resultMultiply);
//        System.out.println("Return method: " + resultDivision);
//
//
//
//
//
//   }}




