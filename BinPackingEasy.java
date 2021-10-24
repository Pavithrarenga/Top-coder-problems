import java.util.Arrays;
import java.util.Collections;

public class BinPackingEasy {
    public static int minBins(int[] item) {
        int minimumNumberOfBinsRequired = 0;
        int maximumCapacityOfBin = 300;
        int size = item.length - 1;
        int i = 0;

        Arrays.sort(item);
//        traversing through all the items by checking the condition
        while (i <= size) {
//            checking whether first item + last item is greater than 300 because maximum bin capacity is 300
//            If it is, then we will compare with the second last most value by decrementing
//            else, then also the size will be  decremented and the minimum bit count will be incremented simultaneously
            if (item[i] + item[size] > maximumCapacityOfBin) {
                size = size - 1;
//                minimumNumberOfBinsRequired = minimumNumberOfBinsRequired + 1;
            } else {
                size = size - 1;
                i = i + 1;

            }
            minimumNumberOfBinsRequired = minimumNumberOfBinsRequired + 1;

        }
        return minimumNumberOfBinsRequired;
    }

    public static void main(String[] args) {
        System.out.println(minBins(new int[]{123, 145, 167, 213, 245, 267, 289, 132, 154, 176, 198}));
    }
}
