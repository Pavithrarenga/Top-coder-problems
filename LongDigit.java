public class LongDigit {
    static long check(long X) {
        long sum = 0;
        while (X > 0) {
            sum += X;
            X /= 10;
        }
        return sum;
    }
//    Binary search logic
    public static long findX(long S) {
        long high = S;
        long low = 0;
        while (high - low > 1) {
            long mid = (high + low) / 2;
            if (check(mid) > S) {
                high = mid;
            } else {
                low = mid;
            }
        }

        for (long i = Math.max(low - 10, 0); i < high + 10; i++) {
            if (check(i) == S)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findX(3000));
    }

}
