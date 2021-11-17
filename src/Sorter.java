public class Sorter {
    public static int[] sort(int[] unsorted) {
        int temp;
        for (int i = 1; i < unsorted.length; i++) {
            for (int j = i; j > 0; j--) {
                if (unsorted[j] < unsorted[j - 1]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = temp;
                }
            }
        }
        return unsorted; // TODO
    }
}
