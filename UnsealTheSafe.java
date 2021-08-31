public class UnsealTheSafe {
    public static long countPasswords(int N) {
//        I know that last digit of the password depends on the previous digits
//        Let me have an array to store the number of passwords of length as N and with a Digit at the end.
        long[][] password = new long[50][15];
//        if N is 1 then we will have password[N][Digit] will be 1
        long result = 0;
        for (int i = 0; i <= 9; i++) {
            password[1][i] = 1;
        }
        for (int i = 2; i <= N; i++) {
            password[i][0] = password[i - 1][7];
            password[i][1] = password[i - 1][2] + password[i - 1][4];
            password[i][2] = password[i - 1][1] + password[i - 1][3] + password[i - 1][5];
            password[i][3] = password[i - 1][2] + password[i - 1][6];
            password[i][4] = password[i - 1][1] + password[i - 1][5] + password[i - 1][7];
            password[i][5] = password[i - 1][2] + password[i - 1][4] + password[i - 1][6] + password[i - 1][8];
            password[i][6] = password[i - 1][3] + password[i - 1][5] + password[i - 1][9];
            password[i][7] = password[i - 1][4] + password[i - 1][8] + password[i - 1][0];
            password[i][8] = password[i - 1][5] + password[i - 1][7] + password[i - 1][9];
            password[i][9] = password[i - 1][6] + password[i - 1][8];

        }
        for (int i = 0; i <= 9; i++) {
            result = result + password[N][i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countPasswords(2));
    }
}
