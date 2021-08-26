public class LotteryTicket {
    public static String buy(int price, int b1, int b2, int b3, int b4) {
        for (int i1 = 0; i1 <= 1; i1++) {
            int a1 = b1 * i1;
            for (int i2 = 0; i2 <= 1; i2++) {
                int a2 = b2 * i2;
                for (int i3 = 0; i3 <= 1; i3++) {
                    int a3 = b3 * i3;
                    for (int i4 = 0; i4 <= 1; i4++) {
                        int a4 = b4 * i4;

                        if ( a1 + a2 + a3 + a4 == price) {
                            return "POSSIBLE";
                        }
                    }
                }
            }
        }
        return "IMPOSSIBLE";
    }
    public static void main (String[] args) {
        System.out.println(buy(65, 1, 5, 10, 50));
    }
}
