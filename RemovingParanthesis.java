public class RemovingParanthesis {
    public static int countWays(String s) {
        int count = 0;
        int answer = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count = count + 1;
            } else {
                answer = answer * count;
                count = count - 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(countWays("((()()()))"));
    }
}
