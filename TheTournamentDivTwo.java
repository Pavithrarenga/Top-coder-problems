public class TheTournamentDivTwo {
    public static void main(String[] args) {
        int[] points = {10,1,1};
        System.out.println(find(points));
    }
    public static int find(int[] points) {
            int sum = 0;
            for (int point : points) {
                sum += point;
            }
            if (sum % 2 == 0) {
                return sum / 2;
            } else {
                return -1;
            }
    }
}
