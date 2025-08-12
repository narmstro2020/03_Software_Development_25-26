public class Main {

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static String flipCoin() {
        if (Math.random() < 0.5) {
            // TODO: return the string Heads
        } else {
            // TODO: return the string Tails
        }
    }

    public static int rollDice() {
        return getRandomNumber(1, 6);
    }

    public static int spinWheel() {
        // TODO: returns a random number between and including 1 and 8.
    }

    public static int getPick() {
        // TODO: returns a random number between and including 1 and 99.
    }

    public static void main(String[] args) {
        int result = getRandomNumber(5, 15);
        System.out.println("Random number between 5 and 15: " + result);

        System.out.println("Coin flip: " + flipCoin());

        System.out.println("You rolled a " + rollDice());

        System.out.println("Spinner result: " + spinWheel());

        System.out.println("Your lottery picks:");
        for (int i = 0; i < 5; i++) {
            System.out.println(getPick());
        }
    }

}
