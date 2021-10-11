import java.util.Arrays;

public class TheProgrammingContestDivTwo {
    public static int[] find(int T, int[] requiredTime) {
        Arrays.sort(requiredTime);
        int[] score = new int[2];
        int elapsed = 0;
        for (int time : requiredTime) {
            if (elapsed + time > T) {
                break;
            }
            elapsed += time;
            score[0]++;
            score[1] += elapsed;
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(47, new int[]{8, 5})));
    }
}
