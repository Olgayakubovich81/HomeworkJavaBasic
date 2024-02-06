
public class Main {
    public static void main(String[] args) {
        int temperature1 = 120;
        int temperature2 = 90;
        boolean result = functionCorrect(temperature1, temperature2);
        System.out.println(result);

    }


    public static boolean functionCorrect(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;

        } else {
            return false;

        }
    }

}