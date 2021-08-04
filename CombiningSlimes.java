import java.util.*;
import java.math.*;


public class CombiningSlimes {
  public static void main(String[] args) {

	int[] a = {1,2,3};
	System.out.println("Max Num: " + maxMascots(a));
  } 
  public static int maxMascots(int[] a) {
	Arrays.sort(a);
	int max = 0;
	int mascots;
	for(int i=a.length-1;i>0;i--) {

		mascots = a[i-1] * a[i];
		max = max + mascots;
		a[i-1] = a[i-1] + a[i];
	}
	return max;
  }
}
