public class TheAirTripDivTwo {
    public static int find(int[] flights, int fuel) {
        int sum = 0;
        for (int i = 0; i < flights.length; i++) {
            if (sum + flights[i] > fuel) {
                return i;
            }
            sum += flights[i];
        }
        return flights.length;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{8, 7, 7, 1, 5, 7, 9}, 21));
    }
}

