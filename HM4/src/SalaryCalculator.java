import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество часов в неделю: ");
        double hoursPerWeek = sc.nextDouble();
        System.out.println("Введите зарплату в час: ");
        int moneyPerHour = sc.nextInt();
        double wages = calculateWeeklyWages(moneyPerHour, hoursPerWeek);

        if (wages == -1.0) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Вы заработали: " + wages);
        }
    }

    public static double calculateWeeklyWages(int moneyPerHour, double hoursPerWeek) {
        if (hoursPerWeek > 60 || moneyPerHour < 8) {
            return -1.0;
        }

        if (hoursPerWeek > 40) {
            double extraHours = hoursPerWeek - 40;
            hoursPerWeek = 40 + (extraHours * 1.5);
        }

        double weeklyWages = moneyPerHour * hoursPerWeek;
        return weeklyWages;
    }
}












