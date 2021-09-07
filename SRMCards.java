import java.util.Arrays;

public class SRMCards {
    public static int maxTurns(int[] cards) {
        int result = 0;
        int i = 0;
        Arrays.sort(cards);
        for (i = 0; i < cards.length - 1; i++) {
            if (cards[i + 1] == (cards[i] + 1)) {
                i = i + 1;
                result = result + 1;
            }
        }
        if (i == (cards.length - 1)) {
            result = result + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxTurns(new int[]{1}));
    }
}
