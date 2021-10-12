public class AdditionGame {
    public static int getMaximumPoints(int A, int B, int C, int N) {
        int point = 0;
        for (int i = 0; i < N; i++) {
            int max = Math.max(Math.max(A, B), C);
            if (max == 0) {
                break;
            }
            point += max;
            if (A == max) {
                A--;
            } else if (B == max) {
                B--;
            } else if (C == max) {
                C--;
            }
        }
        return point;
    }

    public static void main(String[] args) {
        System.out.println(getMaximumPoints(1, 1, 1, 8));
    }
}
