import java.util.Arrays;

public class CellRemoval {
    public static int cellsLeft(int[] parent, int deletedCell) {
        boolean[] deleted = new boolean[parent.length];
        deleted[deletedCell] = true;
        for (int i = 0; i < deleted.length; i++) {
            int index = i;
            while (index != -1) {
                if (deleted[index]) {
                    deleted[i] = true;
                    break;
                }
                index = parent[index];
            }
        }
        boolean leaves[] = new boolean[parent.length];
        Arrays.fill(leaves, true);
        for (int i = 0; i < leaves.length; i++) {
            if (!deleted[i] && parent[i] != -1) {
                leaves[parent[i]] = false;
            }
        }
        int leftCount = 0;
        for (int i = 0; i < leaves.length; i++) {
            if (!deleted[i] && leaves[i]) {
                leftCount++;
            }
        }
        return leftCount;
    }

    public static void main(String[] args) {
        System.out.println(cellsLeft(new int[]{-1, 0, 0, 2, 2, 4, 4, 6, 6}, 4));
    }
}
