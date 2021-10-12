public class OptimalList {
    public static String optimize(String inst) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < inst.length(); i++) {
            char direction = inst.charAt(i);
            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'W') {
                x--;
            } else {
                x++;
            }
        }
        String result = "";
        if (x > 0) {
            result += multiply('E', x);
        }
        if (y > 0) {
            result += multiply('N', y);
        }
        if (y < 0) {
            result += multiply('S', -y);
        }
        if (x < 0) {
            result += multiply('W', -x);
        }
        return result;
    }

    static String multiply(char ch, int times) {
        return String.valueOf(ch).repeat(Math.max(0, times));
    }

    public static void main(String[] args) {
        System.out.println(optimize("NENENNWWWWWS"));
    }
}
