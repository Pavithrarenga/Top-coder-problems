import java.util.Arrays;

public class MiniatureDachshund {
    public static int maxMikan(int[] mikan, int weight) {
        Arrays.sort(mikan);
        int count = 0;
        for (int i = 0; i < mikan.length; i++) {
            if (mikan[i] + weight > 5000)
                break;
            weight += mikan[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxMikan(new int[]{100, 100, 100, 100, 100}, 4750));
    }
}
