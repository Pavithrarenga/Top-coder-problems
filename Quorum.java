import java.util.Arrays;

public class Quorum {
    public static int count(int[] arr, int k) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{50, 2, 9, 49, 38}, 3));
    }
}
