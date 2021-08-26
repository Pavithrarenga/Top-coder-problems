public class StringsBetween {
    public static long count(int L, String A , String B) {

        return (less(B, L) - less(A, L) - 1);
    }
    public static long less(String A, int L) {
        long ans = A.length();
        char[] c = A.toCharArray();

        if (A.length() == 0)
            return 0;
        for (int i =0; i<A.length(); i++) {
            long p = 1;
            for (int j = 0; j<= L-i-1; j++) {
                ans += p * (c[i] - 'a') ;
//                ans = ans + p;
                p = p * 26;
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        System.out.println(count(2, "ay", "c"));
    }
}
