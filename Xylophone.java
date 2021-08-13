import java.util.HashSet;
import java.util.Set;
public class Xylophone {
    public static void main(String[] args) {
        System.out.println(countKeys(new int[]{7,3,2,4,1,5,6}));
    }
    public static int countKeys(int[] keys) {
        Set<Integer> uniqueElements = new HashSet<>();
        int distinctNumber;
        for (int key : keys) {
            int remainder = key % 7;
            uniqueElements.add(remainder);

        }
        distinctNumber = uniqueElements.size();
        return distinctNumber;

    }
}
