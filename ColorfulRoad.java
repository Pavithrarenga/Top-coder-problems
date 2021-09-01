import java.util.Arrays;

public class ColorfulRoad {
    public static int getMin(String road) {
        int len = road.length();
        if (len <= 1)
            return 0;
        int[] minCost = new int[len];
        Arrays.fill(minCost, -1);
        minCost[0] = 0;
        char colorPrev = 'R';
        for (int i = 1; i < len; i++) {
            char[] r = road.toCharArray();
            if (r[i] == 'R')
                colorPrev = 'B';
            else if (r[i] == 'G')
                colorPrev = 'R';
            else
                colorPrev = 'G';
            for (int j = 0; j < i; j++) {
                if (r[j] == colorPrev && minCost[j] != -1) {
                    int i1 = minCost[j] + (i - j) * (i - j);
                    if (minCost[i] == -1)
                        minCost[i] = i1;
                    else
                        minCost[i] = Math.min(minCost[i], i1);
                }
            }
        }
        return minCost[len - 1];
    }

    public static void main(String[] args) {
        System.out.println(getMin("RGGGB"));
    }
}
