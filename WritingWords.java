public class WritingWords {
    public static void main(String[] args) {
        System.out.println(write("TOPCODER"));
    }
    public static int write(String word) {
//        Need to intialise at first count(tapping the button) value as 0
        int count = 0;
//        To keep the count of the current value
        int charCount = 0;
//        Need to traverse through the string(word) one by one
//        Using for loop
//        char[] w = word.toCharArray();
        for (char c : word.toCharArray()) {
//          Now, I should calculate the number of times ciel tap a button
//          while typing any word
//          I am traversing through each letter in the word
//          And subtracting it with the 'A' Since A is the first letter of alphabets
//          Adding the answer count with plus 1 because to move with another character in the given word
            charCount = c - 'A' + 1;
            count = count + charCount;

        }
        return count;
    }
}
