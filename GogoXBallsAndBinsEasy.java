public class GogoXBallsAndBinsEasy {
    public static int solve(int[] T) {
        int move = 0;
        for (int i = 0, j = T.length - 1; i < j; i++, j--) {
            move = move + T[j] - T[i];
        }
        return move;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 6, 7, 8}));
    }
}
