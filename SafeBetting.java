public class SafeBetting {
    public static int minRounds(int a, int b, int c) {
//        Having count value to see how many rounds Limak gets to reach the goal
        int minimumRounds = 0;

//        Given Limak should reach atleast c dollars
//        using while loop to check the condition until c is greater than b
        while (c > b) {
            int minimumValue = b - a;
            b = b + minimumValue;
            minimumRounds = minimumRounds + 1;

        }
        return minimumRounds;

    }

    public static void main(String[] args) {
        System.out.println(minRounds(17, 30, 1000));
    }
}
