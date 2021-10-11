public class LeftAndRightHandedDiv2 {
    public static int count(String S) {
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'R' && S.charAt(i + 1) == 'L')
                count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("RLRLRL"));
    }
}
