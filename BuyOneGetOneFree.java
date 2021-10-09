import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class BuyOneGetOneFree {
    public static int buy(int[] prices) {
//        Integer[] sort = prices;
        Integer[] array = Arrays.stream(prices) // IntStream
                .boxed()                // Stream<Integer>
                .toArray(Integer[]::new);
        sort(array, Collections.reverseOrder());
        int minimumCost = 0;
        for (int i = 0; i < prices.length; i = i + 2) {
            minimumCost += prices[i];
        }

        return minimumCost;
    }

    public static void main(String[] args) {
        System.out.println(buy(new int[]{100, 100, 100, 100, 100, 100}));
    }
}
