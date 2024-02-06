public class Elevator {
    public static void main(String[] args) {
        int stepUp = 50;
        int stepDown = 1;
        int floor = 200;
        int sumOfLifts = 0;


        numberOfLifts(stepUp, stepDown, floor, sumOfLifts);
    }

    private static void numberOfLifts(int stepUp, int stepDown, int floor, int sumOfLifts) {
        while (floor > 0) {
            sumOfLifts++;
            floor = floor - stepUp + stepDown;


            if (floor <= 0) {
                break;
            }

               }

        System.out.println("Количество подъемов: " + sumOfLifts);
    }
}

