public class EmoticonsDiv2 {
    public static int printSmiles(int smiles) {
//        int smiles starts with 2 and traversing upto n square will be less than or equal to smiles
//        while traversing we will check whether smiles modulo n is equal to 0.
//        smiles = 2
//        2 % 2 == 0 yes
//        smiles = 1; actions = 1

        int actions = 0;
        for (int n = 2; n * n <= smiles; n++) {
            while (smiles % n == 0) {
                smiles = smiles / n;
                actions = actions + n;
            }
        }
        if (smiles != 1) {
            actions = actions + smiles;
        }
        return actions;
    }

    public static void main(String[] args) {
        System.out.println(printSmiles(1000));
    }
}

