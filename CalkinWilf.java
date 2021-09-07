import java.util.Arrays;

public class CalkinWilf {

    public static void main (String[] args) {
        String path = "LRR";
        System.out.println(Arrays.toString(findRational(path)));
    }

    public static int [] findRational(String path) {
        int a = 1;
        int b = 1;
//        int[] ans = new int[];
        for(int i =0;i<path.length();i++) {
            if(path.charAt(i) == 'L')
                b = a +b;
            else
                a = a + b;
//        System.out.println(a);
//        System.out.println(b);
        }
        return new int[] {a, b};
    }
}
