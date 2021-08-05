public class IOIGuaranteedPlace {
    public static void main(String[] args) {
        int n = 8;
//        int[] res = new int[n];
        int[] day1scores = {300, 300, 200, 200, 100, 100, 0, 0};
        int[] day2scores = {270, 270, 270, 270, 270, 270, 270, 270};
        for ( int i : solve(n, day1scores, day2scores))
            System.out.println(i);
    }


    public static int[] solve(int n, int[] day1scores, int[] day2scores) {
        int[] rank = new int[n];
        for(int i = 0; i < n; i++){
            int sum = day1scores[i] + day2scores[i];
//            System.out.println(curr);
            int count = 0;
            for(int j = 0; j < n; j++){
                if(j == i)
                    continue;
                if(day1scores[j] + 300 > sum)
                    count++;
//                System.out.println(count);
            }
            rank[i] = count + 1;

//            System.out.println(rank[i]);
        }
        return rank;

    }
}

