public class MaximumBalances {
    public static void main(String[] args) {
        System.out.println(solve("(()))"));
    }
    public static int solve(String s) {
        int left = 0;
        int right = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i)=='(') {
                left++;
            } else if(s.charAt(i)==')') {
                right++;
            }
        }
        int c = Math.min(left, right);
        int ans = (c*(c+1))/2;
        return ans;
    }
}
