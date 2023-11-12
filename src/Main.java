public class Main {
    public static void main(String[] args) {
        int tab1[ ] = {3, 2, -2, 5, -3};
        int tab2[ ] = {1, 1, 2, -1,2, -1};
        int tab3[ ] = {1, 2, 3, -4};
        int tab4[ ] = {1, 1};
        int tab5[ ] = {-2,2,1,3,-3};

        finder(tab1);
        finder(tab2);
        finder(tab3);
        finder(tab4);
        finder(tab5);
    }

    public static void finder(int[] arr){
        int keeper = 0;
        for (int j = 0; j < arr.length; j++){

                for (int k = j+1; k < arr.length; k++){
                    if(arr[j] == arr[k]) {
                        continue;
                    }
                    else if (Math.abs(arr[j]) == Math.abs(arr[k]) && Math.abs(arr[j]) > keeper){

                            keeper = Math.abs(arr[j]);
                            break;
                    }
                }
        }
        if (keeper == 0) {
            System.out.println("There is no suitable pair");
        }
        else {
            System.out.println("The pair is " + keeper + " and " + (-keeper));
        }
    }
}
