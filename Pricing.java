import java.util.Arrays;

public class Pricing {
    public static int maxSales(int[] price) {
        Arrays.sort(price);
        int ans = -1;
        int n = price.length;
        for (int i = 0; i < price.length; i++) {
            for (int j = i; j < price.length; j++) {
                for (int k = j; k < price.length; k++) {
                    for (int l = k; l < price.length; l++) {
                        if (i != j) {
                            if (j != k) {
                                if (k != l) {
                                    int a = price[l] * (n-l);
                                    int b = price[k] * (l-k);
                                    int c = price[j] * (k-j);
                                    int d = price[i] * (j-i);
                                    ans = Math.max(ans, (a+b+c+d));
                                }
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        System.out.println(maxSales(new int[]{9, 1, 5, 5, 5, 5, 4, 8, 80}));
    }
}
