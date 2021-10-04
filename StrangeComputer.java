public class StrangeComputer {
    public static int setMemory(String mem) {

        int memBit = '0';
        int minOperationCount = 0;
        for (int i = 0; i < mem.length(); i++) {
            char m = mem.charAt(i);
            if (m != memBit) {
                memBit = m;
                minOperationCount = minOperationCount + 1;
            }
        }
        return minOperationCount;
    }

    public static void main(String[] args) {
        System.out.println(setMemory("0100"));
    }
}
