public class RangeEncoding {
    public static int minRanges(int[] arr) {
        int ranges = 1;
        int currentPosition = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentPosition + 1) {
                currentPosition = arr[i];
            } else {
                ranges = ranges + 1;
                currentPosition = arr[i];
            }
        }
        return ranges;
    }

    public static void main(String[] args) {
        System.out.println(minRanges(new int[]{1, 6, 10, 20, 32, 49}));
    }
}
