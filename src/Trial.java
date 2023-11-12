public class Trial {
    public static void main(String[] args) {
        int[] tab1 = {3, 2, -2, 5, -3};
        printHighestAbsolutePair(tab1);

        int[] tab2 = {1, 1, 2, -1, 2, -1};
        printHighestAbsolutePair(tab2);

        int[] tab3 = {1, 2, 3, -4};
        printHighestAbsolutePair(tab3);

        int[] tab4 = {1, 1};
        printHighestAbsolutePair(tab4);

        int[] tab5 = {-2, 2, 1, 3, -3};
        printHighestAbsolutePair(tab5);
    }

    public static void printHighestAbsolutePair(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > 0 && num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num < 0 && Math.abs(num) > max2) {
                max2 = Math.abs(num);
            }
        }

        if (max1 > 0 && max2 > 0) {
            System.out.println("The returned result is a pair of " + max1 + " and |" + max2 + "|");
        } else {
            System.out.println("The returned result is information about the lack of pair");
        }
    }
}