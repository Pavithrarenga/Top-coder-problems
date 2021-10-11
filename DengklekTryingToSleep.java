public class DengklekTryingToSleep {
    public static int minDucks(int[] ducks) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int duck : ducks) {
            min = Math.min(min, duck);
            max = Math.max(max, duck);
        }
        return max - min + 1 - ducks.length;
    }

    public static void main(String[] args) {
        System.out.println(minDucks(new int[]{7, 4, 77, 47, 74, 44}));
    }
}
