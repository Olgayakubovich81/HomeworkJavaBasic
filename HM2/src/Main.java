//
//public class Main {
//    public static void main(String[] args) {
//        String str = new String("I study Basic Java!");
//        printString(str);
//    }
//    public static void printString(String str) {
//
//            System.out.println(str);
//            System.out.println(str.charAt(str.length() - 2));
//            System.out.println(str.substring(5,16));
//            System.out.println(str.toLowerCase());
//            System.out.println(str.toUpperCase());
//    }

    public class Main {

        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;

            sum(num1, num2);
            dif(num1, num2);
            multiply(num1, num2);
            div(num1, num2);
        }


        public static void sum(int num1, int num2) {
            System.out.println(num1 + num2);
        }

        public static void dif(int num1, int num2) {
            System.out.println(num1 - num2);
        }

        public static void multiply(int num1, int num2) {
            System.out.println(num1 * num2);
        }

        public static void div(int num1, int num2) {
            System.out.println(num1 / num2);


        }
    }
