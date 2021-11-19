//import java.util.Scanner;
//import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1};
        int[] arr2 = {300, 200, 100};
        int[] arr3 = {-2, -1, -4};
        int[] arr4 = {0, -5, -3};

        testAdder(arr);
        testAdder(arr2);
        testAdder(arr3);
        testAdder(arr4);
    }

    private static void testAdder(int[] arr) {
        int[] res = Sorter.sort(arr);
        if (arr == res) {
            System.out.println("OK");
        } else {
            System.err.println("Error: recieved " + res + ", expected " + arr);
        }
    }
}
