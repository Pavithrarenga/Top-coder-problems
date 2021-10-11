import java.util.Arrays;

public class RollingDiceDivTwo {
    public static int minimumFaces(String[] rolls) {
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = sortRoll(rolls[i]);
        }
        int result = 0;
        for (int i = 0; i < rolls[0].length(); i++) {
            int maxFace = Integer.MIN_VALUE;
            for (String roll : rolls) {
                maxFace = Math.max(maxFace, roll.charAt(i) - '0');
            }
            result += maxFace;
        }
        return result;
    }

    public static String sortRoll(String roll) {
        char[] faces = roll.toCharArray();
        Arrays.sort(faces);
        return new String(faces);
    }
    public static void main(String[] args) {
        System.out.println(minimumFaces(new String[]{"137", "364", "115", "724"}));
    }
}

