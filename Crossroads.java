import java.util.ArrayList;

public class Crossroads {
    public static int[] getOut(int[] angles) {
        int i = angles.length - 1;
        int j = i - 1;
        boolean[] index = new boolean[i + 1];

        boolean flag = false;

        while (j >= 0) {
            if (!index[j] && !index[i]) {
//                If angle i is less than angle j, then the cars will intersect
                if (angles[j] >= angles[i]) {
                    i = j;
                } else {
                    flag = true;
                    int x = 180 - angles[i];
                    if (angles[j] < x) {
                        index[j] = true;
                    } else {
                        index[i] = true;
                        i = j;
                    }
                }
                j = j - 1;
            } else if (!index[j] && index[i]) {
                i = j;
                j = j - 1;
            } else if (index[j] && !index[i]) {
                j = j - 1;
            } else {
                i = j - 1;
                j = i - 1;
            }
            if (j < 0) {
                if (!flag)
                    break;
                i = angles.length - 1;
                j = i - 1;
                flag = false;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int k = 0; k < index.length; k++) {
            if (!index[k])
                list.add(k);
        }
        int[] val = new int[list.size()];
        for (int k = 0; k < val.length; k++) {
            val[k] = list.get(k);
        }
        return val;
    }

    public static void main(String[] args) {
        int[] angles = {105, 75, 25, 120, 35, 75};

        int[] carIndex = getOut(angles);
        for (int i : carIndex) {
            System.out.print(i + " ");
        }
    }
}
