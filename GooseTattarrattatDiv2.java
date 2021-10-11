public class GooseTattarrattatDiv2 {
    public static int getmin(String S) {
        int n = S.length();
        int[] a = new int[26];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int v = S.charAt(i) - 'a';
            a[v]++;
            if (a[v] > max)
                max = a[v];
        }
        return n - max;
    }

    public static void main(String[] args) {
        System.out.println(getmin("topcoder"));
    }
}
