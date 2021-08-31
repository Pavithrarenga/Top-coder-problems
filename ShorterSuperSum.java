public class ShorterSuperSum {
    public static int calculate(int k, int n) {
        int superSum = 0;
//        Base condition
        if (k == 0) {
            return n;
        } else {
            for (int i = 1; i <= n; i++) {
                superSum = superSum + calculate(k - 1, i);
            }
        }
        return superSum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 3));
    }
}
