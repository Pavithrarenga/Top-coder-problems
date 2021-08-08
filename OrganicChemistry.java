public class OrganicChemistry {
    public static void main(String[] args) {
        String atoms = "CCO";
        int[] X = {0,1};
        int[] Y= {1,2};

        System.out.println(countHydrogens(atoms, X, Y));

    }

    public static int countHydrogens(String atoms, int[] X, int[] Y) {

        char[] a = atoms.toCharArray();
        int total = 0;
        for(char c : a){
            if(c == 'O'){
                total += 2;
            }else if(c == 'N'){
                total += 3;
            }else{
                total += 4;
            }
        }
        return total - (X.length + Y.length);

    }
}
