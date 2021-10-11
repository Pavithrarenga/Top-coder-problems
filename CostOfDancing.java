import java.util.Arrays;

public class CostOfDancing {
    public static int minimum(int K, int[] danceCost) {
        Arrays.sort(danceCost);
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum = sum + danceCost[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minimum(1, new int[]{2, 2, 4, 5, 3}));
    }
}
