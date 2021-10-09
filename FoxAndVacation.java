import java.util.Arrays;

public class FoxAndVacation {
    public static int maxCities(int total, int[] d) {
        Arrays.sort(d);
        int visitedNum = 0;
        for (int stay : d) {
            if (total < stay) {
                break;
            }
            total = total - stay;
            visitedNum = visitedNum + 1;
        }
        return visitedNum;
    }

    public static void main(String[] args) {
        System.out.println(maxCities(5, new int[]{2, 2, 2}));
    }
}
