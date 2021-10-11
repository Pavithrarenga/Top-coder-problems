public class GreatFairyWar {
    public static int minHP(int[] dps, int[] hp) {
        int total = 0;
        for (int i = 0; i < dps.length; i++) {
            int sum = 0;
            for (int j = i; j < dps.length; j++) {
                sum = sum + dps[j];
            }
            total = total + hp[i] * sum;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(minHP(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }

}
