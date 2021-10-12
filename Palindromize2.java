public class Palindromize2 {
    public static String minChanges(String s) {
        StringBuffer changed = new StringBuffer(s);
        for (int i = 0, j = changed.length() - 1; i < j; i++, j--) {
            char ch = (char) (Math.min(s.charAt(i), s.charAt(j)));
            changed.setCharAt(i, ch);
            changed.setCharAt(j, ch);
        }
        return changed.toString();
    }

    public static void main(String[] args) {
        System.out.println(minChanges("abcdef"));
    }
}
