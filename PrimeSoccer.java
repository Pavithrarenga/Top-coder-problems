public class PrimeSoccer {
    public static double getProbability(int skillOfTeamA, int skillOfTeamB) {
        double primeProbA = calcPrimeProb(skillOfTeamA);
        double primeProbB = calcPrimeProb(skillOfTeamB);
        return 1 - (1 - primeProbA) * (1 - primeProbB);
    }

    public static double calcPrimeProb(int skillOfTeam) {
        final int MAX_SCORE = 18;
        double scoreProb = skillOfTeam / 100.0;
        double primeProb = 0;
        for (int score = 0; score <= MAX_SCORE; score++) {
            if (isPrime(score)) {
                primeProb += C(MAX_SCORE, score) * Math.pow(scoreProb, score)
                        * Math.pow(1 - scoreProb, MAX_SCORE - score);
            }
        }
        return primeProb;
    }

    public static int C(int n, int m) {
        long result = 1;
        for (int i = n; i > n - m; i--) {
            result = result * i;
        }
        for (int i = 1; i <= m; i++) {
            result = result / i;
        }
        return (int) result;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getProbability(50, 50));
    }
}