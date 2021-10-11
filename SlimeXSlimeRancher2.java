public class SlimeXSlimeRancher2 {
    public static int train(int[] attributes) {
        int maxAttribute = -1;
        for (int attribute : attributes) {
            maxAttribute = Math.max(maxAttribute, attribute);
        }
        int weight = 0;
        for (int attribute : attributes) {
            weight += maxAttribute - attribute;
        }
        return weight;
    }

    public static void main(String[] args) {
        System.out.println(train(new int[]{900, 500, 100}));
    }
}
