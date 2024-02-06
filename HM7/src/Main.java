import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random num = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.nextInt(50) +1;
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr));

             for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }

          System.out.println("Измененный массив: " + Arrays.toString(arr));
    }
}
