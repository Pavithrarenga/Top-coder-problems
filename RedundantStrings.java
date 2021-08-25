public class RedundantStrings {
    public static int howMany(int length) {
        int countValue = 0;
        int result = 0;

//        Base condition
        if ( length == 1)
            return 0;

        for (int i = 1; i<length; i++) {
            if ((length % i) == 0) {
                countValue = howMany(i);
                countValue = (int) (Math.pow(2, i) - countValue);
                result = result+countValue;
//                break;
            }
        }
        return result;
    }
    public static void main (String[] args) {
        System.out.println(howMany(60));
    }
}
