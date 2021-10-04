import java.util.Arrays;

public class WinterAndMandarins {
    public static int getNumber(int[] bags, int K) {
        Arrays.sort(bags);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i + K - 1 < bags.length; i++) {
            minDifference = Math.min(minDifference, bags[i + K - 1] - bags[i]);
        }
        return minDifference;
    }

    public static void main(String[] args) {
        System.out.println(getNumber(new int[]{47, 1000000000, 1, 74}, 2));
    }
}
