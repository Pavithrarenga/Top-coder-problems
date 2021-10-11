import java.util.Arrays;

public class TheSquareDivTwo {
    public static String[] solve(String[] board) {
        int n = board.length;
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i].charAt(j) == 'C') {
                    r[i]++;
                }
            }
        }
        String[] placement = new String[n];
        for (int i = 0; i < n; i++) {
            placement[i] = "";
            for (int j = 0; j < n; j++) {
                if (i + r[j] >= n) {
                    placement[i] += 'C';
                } else {
                    placement[i] += '.';
                }
            }
        }
        return placement;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new String[]{"..", "C."})));
    }
}
