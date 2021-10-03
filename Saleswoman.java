public class Saleswoman {
    public static int minMoves(int[] pos, int[] delta) {
        int sum = 0;
        int position = 0;
        boolean[] bol = new boolean[pos.length];
        int result = 0;
//        Traversing through all the position
        for (int i = 0; i < pos.length; i++) {
//            Adding all the delta with sum value.
            sum = sum + delta[i];
            if (delta[i] >= 0) {
                bol[i] = true;
            }
            if (sum >= 0) {
                result = result + (pos[i] - position);
                position = pos[i];
                for (int j = 0; j <= i; j++) {
                    if (!bol[j]) {
                        result = result + ((position - pos[j]) * 2);
                        break;
                    }
                }
                for (int j = 0; j <= i; j++) {
                    bol[j] = true;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, new int[]{-1, -1, -1, -1, 1, 1, 1, 1}));
    }
}
