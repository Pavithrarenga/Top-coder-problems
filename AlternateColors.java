public class AlternateColors {
    public static void main(String[] args) {
        System.out.println(getColor(35,41,37,106));
    }
    public static String getColor(long r, long g, long b, long k) {
//        Dividing the problem into 3 cases
//        Case 1 - steps (Doing it for the example 1,1,1,3)
//          1. Having a temporary variable and assigning the value as r
//          2. The temp value finding the minimum number of red color and the minimum value of g and b
//          3. Having a k condition for the k should be less than the three times the temp values
//          4. Then, if the k%3 is equal to 1, then the destroyed ball will be red,
//             if its value is 2, then the destroyed ball color will be green,
//             if the value is 0, then the destroyed ball color is blue
        long tempValue = Math.min(r, Math.min(g,b));

//          5. If k value is greater than or equal to the temp value, then do step 4

        if(k <= 3* tempValue) {
            if (k % 3 == 1)
                return "RED";
            if (k % 3 == 2)
                return "GREEN";
            if (k % 3 == 0)
                return "BLUE";
        }
//       Case 2
//        1. Now I need to decrease the r, g, b with the minimum number and for k
//           I would decrease by 3 times the temp number by k value.
        k = k - 3*tempValue;
        r = r - tempValue;
        g = g - tempValue;
        b = b - tempValue;

//        Now lets have r = 0, then we have 2 cases that is we have to consider g and b
        if (r==0) {
//            Here lets have k should be less than or equal to the minimum value of g and b
            if (k <= 2* Math.min(g,b)) {
                if(k%2 == 0)
                    return "BLUE";
                if (k%2 == 1)
                    return "GREEN";
            }
//        Now if g is greater than b then the color will be green
            else if (g>=b)
                return "GREEN";
            else
                return "BLUE";

        }
//        Similarly, now doing the same steps for if g = 0
        if (g==0) {
//            Here lets have k should be less than or equal to the minimum value of g and b
            if (k <= 2* Math.min(r,b)) {
                if(k%2 == 0)
                    return "BLUE";
                if (k%2 == 1)
                    return "RED";
            }
//        Now if g is greater than b then the color will be green
            else if (r>=b)
                return "RED";
            else
                return "BLUE";

        }
//        Similarly, now doing the same steps for if b = 0
        if (b==0) {
//            Here lets have k should be less than or equal to the minimum value of g and b
            if (k <= 2* Math.min(r,g)) {
                if(k%2 == 0)
                    return "GREEN";
                if (k%2 == 1)
                    return "RED";
            }
//        Now if g is greater than b then the color will be green
            else if (r>=g)
                return "RED";
            else
                return "GREEN";

        }



        return "NO_COLOR";

    }
}

