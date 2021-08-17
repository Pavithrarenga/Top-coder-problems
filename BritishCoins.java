import java.util.Arrays;

public class BritishCoins {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(coins(10000)));
    }
    public static int[] coins(int pence) {
//       Intialising new array to store array of values
//       Here first element will be pounds, 2nd element will be shilling and third will be pennies
        int[] resultantArrayOfCoins = new int[3];
//        Given 12 pennies in a shillings
//        Therefore, shilling = pence / 12
        int shillings = pence / 12;
//        To calculate pennies we have pence(total value) minus the shilling * 12
        int pennies = pence - (shillings * 12);
//        From the question since given 20 shillings in a pound
        int pounds = shillings / 20;
//        To calculate the shillings from the remaining pence
        shillings = shillings % 20;
//        Adding these in the resultant array
        resultantArrayOfCoins[0] = pounds;
        resultantArrayOfCoins[1] = shillings;
        resultantArrayOfCoins[2] = pennies;

        return resultantArrayOfCoins;
    }

}
