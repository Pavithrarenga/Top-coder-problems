import java.util.Arrays;

public class SortingSubsets {

    public static int getMinimalSize(int[] a) {
        int[] bArray = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            bArray[i] = a[i];
        }

        Arrays.sort(bArray);

        for (int i = 0; i < bArray.length; i++) {

            if (a[i] != bArray[i]) {
                count = count + 1;

            }
        }
        return count;

    }

    public static void main (String[] args) {
        System.out.println(getMinimalSize(new int[] {98, 85, 61, 92, 83}));
    }

}
