public class Main {

    public static void main(String[] args) {
            boolean isEdekaOpen = false;
            boolean isReweOpen = true;


            boolean canBuy = buyOrNot(isEdekaOpen, isReweOpen);

            System.out.println("Я могу купить еду, это " + canBuy );

                    }

        public static boolean buyOrNot(boolean isEdekaOpen, boolean isReweOpen) {
            return isEdekaOpen || isReweOpen;
        }
    }
