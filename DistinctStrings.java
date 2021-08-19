import java.util.Arrays;

public class DistinctStrings {
    public static String[] generate(int L, String letters, int N) {
        String[] answer = new String[N];
//        int count =0;
        for (int n = 0; n < N; n++) {
            answer[n] = String.valueOf(letters.charAt(n));

            for (int l = 1; l < L; l++) {
//                tmp++;
                answer[n] = answer[n] + letters.charAt(l + n);

//                tmp++;

            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generate(5, "qwertyuiopasdfghjklzxcvbnm", 10)));
    }
}
