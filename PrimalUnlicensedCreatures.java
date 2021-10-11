import java.util.Arrays;

public class PrimalUnlicensedCreatures {
    public static int maxWins(int initialLevel, int[] grezPower) {
        Arrays.sort(grezPower);
        int i = 0;
        for (i = 0; i < grezPower.length; i++) {
            if (initialLevel > grezPower[i]) {
                initialLevel += grezPower[i] / 2;
            } else
                return i;
        }
        return i;
    }
    public static void main (String[] args) {
        System.out.println(maxWins(20, new int[] {3, 3, 3, 3, 3, 1, 25}));
    }
}
