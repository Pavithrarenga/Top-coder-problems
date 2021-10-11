import java.util.Arrays;

public class Chopsticks {
    public static int getmax(int[] l) {
        int sum = 0;
        Arrays.sort(l);
        for (int i = 0; i < l.length; i++)
            if (i + 1 < l.length && l[i] == l[i + 1]) {
                sum = sum + 1;
                i = i + 1;
            }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getmax(new int[]{1, 2, 3, 2, 1, 2, 3, 2, 1}));
    }
}
