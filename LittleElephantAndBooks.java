import java.util.Arrays;

public class LittleElephantAndBooks {
    public static int getNumber(int[] pages, int number) {
        Arrays.sort(pages);

        int total = pages[number];
        for (int i = 0; i < number - 1; i++) {
            total += pages[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(getNumber(new int[]{74, 7, 4, 47, 44}, 3));
    }
}

