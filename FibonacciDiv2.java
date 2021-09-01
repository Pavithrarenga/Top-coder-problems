public class FibonacciDiv2 {
    public static int find(int N) {
        int previousValue = 0;
        int currentValue = 1;
        while (N > currentValue) {
            int next = previousValue + currentValue;

            previousValue = currentValue;
            currentValue = next;
        }

        return Math.min(N - previousValue, currentValue - N);
    }

    public static void main(String[] args) {
        System.out.println(find(15));
    }
}
