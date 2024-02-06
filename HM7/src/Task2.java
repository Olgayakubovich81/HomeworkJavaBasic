import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random num = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.nextInt(90) +10;
        }

                         System.out.println("Случайный массив: " + Arrays.toString(arr));


                boolean isIncreasing = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] >= arr[i + 1]) {
                        isIncreasing = false;
                        break;
                    }
                }

                   if (isIncreasing) {
                    System.out.println("Массив является строго возрастающей последовательностью.");
                } else {
                    System.out.println("Массив не является строго возрастающей последовательностью.");
                }
            }
        }

