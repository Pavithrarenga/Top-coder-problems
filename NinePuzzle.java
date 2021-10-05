public class NinePuzzle {
    public static int getMinimumCost(String init, String goal) {
        int R_init = 0, R_goal = 0;
        int G_init = 0, G_goal = 0;
        int B_init = 0, B_goal = 0;
        int Y_init = 0, Y_goal = 0;

        for (int i = 0; i < init.length(); i++) {
            if (init.charAt(i) == 'R')
                R_init++;
            if (init.charAt(i) == 'G')
                G_init++;
            if (init.charAt(i) == 'B')
                B_init++;
            if (init.charAt(i) == 'Y')
                Y_init++;
        }

        for (int i = 0; i < goal.length(); i++) {
            if (goal.charAt(i) == 'R')
                R_goal++;
            if (goal.charAt(i) == 'G')
                G_goal++;
            if (goal.charAt(i) == 'B')
                B_goal++;
            if (goal.charAt(i) == 'Y')
                Y_goal++;
        }
        int count = 0;

        if (R_goal - R_init > 0)
            count += R_goal - R_init;
        if (G_goal - G_init > 0)
            count += G_goal - G_init;
        if (B_goal - B_init > 0)
            count += B_goal - B_init;
        if (Y_goal - Y_init > 0)
            count += Y_goal - Y_init;

        return count;
    }

    public static void main(String[] args) {
        String init = "GBBB*BGBBG";
        String goal = "RYYY*YRYYR";

        System.out.println(getMinimumCost(init, goal));
    }

}