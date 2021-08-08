public class BallotCounting {
    public static void main(String[] args) {
        String votes = "B";
        System.out.println(count(votes));
    }
    public static int count(String votes) {
//        Logic: Given a string I need to have a count of A and B
//        such that smallest number will be known
//        I need to have two count variables for "A", "B".
        int a = 0;
        int b = 0;
//        int minNumber = 0;
        for(int i = 1; i<votes.length();i++) {
            if(votes.charAt(i)=='A')
                a++;
            else
                b++;
//            Here we need to find the smallest number to decide who will win
//            for that if a count is greater than the half of the string lenth
//            or b count value is greater than half of the string length
//            then I can return the value at the cuurent position since I started from i = 1.
            if(a > (votes.length()/2) || b > (votes.length()/2))

                return i;

        }
        return votes.length();

    }

}
