public class LargestSubsequence {
    public static String getLargest(String s) {
        String largest = "";
        int index = 0;
        while (index < s.length()) {
            index = findMaxIndex(s, index);
            largest += s.charAt(index);
            index++;
        }
        return largest;
    }

    static int findMaxIndex(String s, int start) {
        int maxIndex = start;
        for (int i = start + 1; i < s.length(); i++) {
            if (s.charAt(i) > s.charAt(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        System.out.println(getLargest("example"));
    }
}
