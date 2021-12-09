import org.junit.Assert;
import org.junit.Test;

public class SortTest {
    public static void main(String[] args) {

    }

    @Test
    public void testsort() {

        int[] testArrAdd = new int[] { 3, 1, 2 };
        int[] testArrSub = new int[] { -2, -1, -3 };
        int[] testArrRan = new int[] { 2, -1, 3, -5 };

        int[] t1 = Sorter.sort(testArrAdd);
        int[] t2 = Sorter.sort(testArrSub);
        int[] t3 = Sorter.sort(testArrRan);

        // Actual
        int[] actualT1 = (t1);
        int[] actualT2 = (t2);
        int[] actualT3 = (t3);

        // Expected
        int[] expectedT1 = { 1, 2, 3 };
        int[] expectedT2 = { -3, -2, -1 };
        int[] expectedT3 = { -5, -1, 2, 3 };

        // Assert
        Assert.assertArrayEquals(actualT1, expectedT1);
        Assert.assertArrayEquals(actualT2, expectedT2);
        Assert.assertArrayEquals(actualT3, expectedT3);
    }

}
