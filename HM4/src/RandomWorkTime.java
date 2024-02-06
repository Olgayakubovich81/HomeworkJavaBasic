
public class RandomWorkTime {
    public static void main(String[] args) {

        int maxSeconds = 28800;
        int n = (int) (Math.random() * (maxSeconds + 1));

        System.out.println("Осталось: " + n + " секунд");

        int hours = n / 3600;


        if (n > 0) {
            System.out.println("Осталось: " + hours + " часов");
        } else if (n <= 3600) {
            System.out.println("Осталось менее часа");
        } else {
            System.out.println("Рабочий день закончился");
        }


    }
}

