public class Main {
    public static void main(String[] args) {
        //int tab[ ] = {3, 2, -2, 5, -3};
        //int tab[ ] = {1, 1, 2, -1,2, -1};
        //int tab[ ] = {1, 2, 3, -4};
        int tab[ ] = {1, 1};
        boolean checker = false;
        for (int j = 0; j < tab.length-1; j++){
            for (int k = j+1; k < tab.length; k++){
                if(tab[j] == tab[k]) {
                    continue;
                }
                else if (Math.abs(tab[j]) == Math.abs(tab[k])){
                    System.out.println("The returned result is a pair of " + tab[j] + " and " + tab[k]);
                    checker = true;
                    break;
                }
            }
            if (checker){
                break;
            }
        }
        if (!checker) {
            System.out.println("the returned result is information about the lack of pair.");
        }
    }
}
