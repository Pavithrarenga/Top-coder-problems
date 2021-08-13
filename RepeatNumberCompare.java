import java.math.BigInteger;

public class RepeatNumberCompare {
    public static void main(String[] args) {
        System.out.println(compare(1234, 10, 456, 20));
    }

    public static String compare(int x1, int k1, int x2, int k2) {
//        converting integer values to string
        String y1 = Integer.toString(x1);
        String l1 = Integer.toString(k1);

//        Repeating the string y1 for l1 times
        String u1 = new String(new char[Integer.parseInt(l1)]).replace("\0", y1);
        String y2 = Integer.toString(x2);
        String l2 = Integer.toString(k2);
//        Repeating the string y2 for l2 times
        String u2 = new String(new char[Integer.parseInt(l2)]).replace("\0", y2);
//        Converting the strings u1 and u2 into integers
        BigInteger v1 = new BigInteger(u1);
        BigInteger v2 = new BigInteger(u2);

//        Logic of the program
        if (v1.compareTo(v2) > 0)
            return "Greater";
        else if (v1.compareTo(v2) < 0)
            return "Less";
        else
            return "Equal";


    }
}

