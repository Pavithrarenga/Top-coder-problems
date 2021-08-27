public class TruckLoads {
    public static int numTrucks(int numCrates, int loadSize) {
        return getSize(numCrates, loadSize);
    }
    public static int getSize(int numCrates, int loadSize) {

        if (numCrates <= loadSize)
            return 1;
        return numTrucks(numCrates / 2, loadSize) + numTrucks(numCrates - (numCrates / 2), loadSize);
    }
//        int n = 0;
//        if (numCrates > loadSize) {
//            if (numCrates % 2 == 0) {
//                numTrucks(numCrates / 2, loadSize);
//                numTrucks(numCrates / 2, loadSize);
//            } else {
//                numTrucks((numCrates + 1) / 2, loadSize);
//                numTrucks(numCrates / 2, loadSize);
//            }
//        }
//        else {
//            n++;
//        }
//        return n;

    public static void main(String[] args) {

        System.out.println(numTrucks(14, 3));
    }
}
