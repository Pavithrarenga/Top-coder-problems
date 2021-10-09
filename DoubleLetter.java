import java.util.ArrayList;

public class DoubleLetter {
    public static String ableToSolve(String S) {
        ArrayList<Character> ch = new ArrayList<Character>();
        for (int i = 0; i < S.length(); i++) {
            char[] s = S.toCharArray();
            ch.add(s[i]);
        }
//        Deleted the consecutive strings
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < ch.size(); i++) {
                if (ch.get(i) == ch.get(i - 1)) {
                    flag = true;
                    ch.remove(i);
                    ch.remove(i - 1);
                }
            }
        }
        if (ch.size() == 0) {
            return "Possible";
        } else {
            return "Impossible";
        }

    }

    public static void main(String[] args) {
        System.out.println(ableToSolve("aabccb"));
    }

}

