import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OppositeParity {
    public static int[] rearrange(int[] A) {
        List<Integer> evenElements = new ArrayList<>(), oddElements = new ArrayList<>();
        for (int i : A)
            if (i % 2 == 0)
                evenElements.add(i);
            else
                oddElements.add(i);

        if (evenElements.size() != oddElements.size()) {
            return new int[0];
        }

        int[] newArray = new int[A.length];
        for (int i = 0, even = 0, odd = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                newArray[i] = oddElements.get(odd);
                odd++;
            } else {
                newArray[i] = evenElements.get(even);
                even++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrange(Arrays.stream(new int[]{1, 4, 1, 4, 2, 1, 3, 5, 6, 2}).toArray())));
    }
}
