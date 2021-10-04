public class BoxesOfBooks {
    public static int boxes(int[] weights, int maxWeight) {
        int boxNumRequired = 0;
        int rest = -1;
        for (int weight : weights) {
            if (weight > rest) {
                rest = maxWeight;
                boxNumRequired = boxNumRequired + 1;
            }
            rest = rest - weight;
        }
        return boxNumRequired;
    }

    public static void main(String[] args) {
        System.out.println(boxes(new int[]{12, 1, 11, 2, 10, 3, 4, 5, 6, 6, 1}, 12));
    }
}
