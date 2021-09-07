public class BadSubstring {
    public static long howMany(int length) {
        int l = 0;
        long start = 0;
        long end = 1;
        while (l < length) {
            long start1 = start + end;
            long end1 = start + 2 * end;
            start = start1;
            end = end1;
            l = l + 1;
        }
        return start + end;
    }

    public static void main(String[] args) {
        System.out.println(howMany(3));
    }
}
