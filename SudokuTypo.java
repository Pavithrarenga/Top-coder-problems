public class SudukoTypo {
    public static void main(String[] args) {
        int[] digits = {8,6,1,2,3,4,9,5,7,
                4,7,9,5,6,1,2,8,3,
                3,2,5,9,7,8,1,6,4,
                9,5,8,1,4,3,6,7,2,
                7,1,2,8,1,6,3,4,9,
                6,3,4,7,2,9,5,1,8,
                5,9,6,4,8,2,7,3,1,
                1,4,3,6,9,7,8,2,5,
                2,8,7,3,1,5,4,9,6};
        System.out.println(fix(digits));

    }
    public static int fix (int[] digits) {

        int[] count = new int[10];
        for(int i =0;i<81;i++) {
            int j = digits[i] - 1;
//            System.out.println(j);
            count[j]++;
//       System.out.println(count[j]);
        }

        for(int i =0; i<9;i++) {
            System.out.println(count[i]);
            if(count[i] < 9)
                return i + 1;

        }
        return 0;

    }
}


