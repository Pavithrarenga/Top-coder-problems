import java.util.Arrays;

public class DerivativeSequence {
    public static int[] derSeq(int[] a, int n) {
        int[] b = new int[a.length];
        for (int i = 0; i< n; i++) {
            b = new int[a.length - 1];
            for (int j =0; j< (a.length - 1); j++) {

                b[j] = a[j+1] - a[j];
//                System.out.println(b[i]);
            }
            a = b;
        }
        return b;
    }
    public static void main (String[] args) {
        System.out.println(Arrays.toString(derSeq(new int[]{5, 6, 3, 9, -1}, 2)));
    }
}
