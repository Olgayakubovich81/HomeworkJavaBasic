package org.example;

public class StartLottery {
    public static void main(String[] args) {
        java_22.hw.lottery.Lottery lottery = new java_22.hw.lottery.Lottery();
        int[] userNumber1 = java_22.hw.lottery.Utils.getUserLotteryNumber();
        int[] userNumber2 = java_22.hw.lottery.Utils.getUserLotteryNumber();
        int[] userNumber3 = java_22.hw.lottery.Utils.getUserLotteryNumber();
        lottery.runLottery();
        int result1 = java_22.hw.lottery.Utils.compareWinnerNumbers(lottery.getWinnerNumber(), userNumber1);
        int result2 = java_22.hw.lottery.Utils.compareWinnerNumbers(lottery.getWinnerNumber(), userNumber2);
        int result3 = java_22.hw.lottery.Utils.compareWinnerNumbers(lottery.getWinnerNumber(), userNumber3);
        System.out.println("User 1: " + result1 + " digits matched!");
        System.out.println("User 2: " + result2 + " digits matched!");
        System.out.println("User 3: " + result3 + " digits matched!");
    }
}