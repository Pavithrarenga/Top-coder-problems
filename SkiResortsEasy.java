public class SkiResortsEasy {
    public static int minCost(int[] altitude) {
        int cost = 0;
        for (int i = 0; i < altitude.length - 1; i++) {
            if (altitude[i + 1] > altitude[i]) {
                cost = cost + (altitude[i + 1] - altitude[i]);
                altitude[i + 1] = altitude[i];
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        System.out.println(minCost(new int[]{6, 8, 5, 4, 7, 4, 2, 3, 1}));
    }
}
