import java.util.Arrays;

public class VocaloidsAndSongs {
    static long[][][][] dp;
    static long MODValue = 1000000007;

    public static int count(int S, int a, int b, int c) {
        dp = new long[55][55][55][55];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                for (int k = 0; k < dp[i][j].length; k++) {
                    Arrays.fill(dp[i][j][k], -1);
                }
            }
        }
        long result = recursion(S, a, b, c);
        return (int) result;
//        return 0;
    }

    public static int recursion(int S, int a, int b, int c) {
        if (dp[S][a][b][c] != -1) {
            return (int) dp[S][a][b][c];
        }
        if (S == 0) {
            if (a == 0 && b == 0 && c == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        long result = 0;
//        Base case: if a+b+c is less than S, then we can return 0
        if (a + b + c < S)
            return 0;
        if (a > 0) {
            result = (result + recursion(S - 1, a - 1, b, c)) % MODValue;
        }
        if (b > 0) {
            result = (result + recursion(S - 1, a, b - 1, c)) % MODValue;
        }
        if (c > 0) {
            result = (result + recursion(S - 1, a, b, c - 1)) % MODValue;
        }
        if ((a > 0) && (b > 0)) {
            result = (result + recursion(S - 1, a - 1, b - 1, c)) % MODValue;
        }
        if ((b > 0) && (c > 0)) {
            result = (result + recursion(S - 1, a, b - 1, c - 1)) % MODValue;
        }
        if ((a > 0) && c > 0) {
            result = (result + recursion(S - 1, a - 1, b, c - 1)) % MODValue;
        }
        if ((a > 0 && b > 0 && c > 0)) {
            result = (result + recursion(S - 1, a - 1, b - 1, c - 1)) % MODValue;
        }
        dp[S][a][b][c] = result;
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(count(3, 1, 1, 1));
    }
}
