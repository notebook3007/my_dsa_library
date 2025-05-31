package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static sorting.SortingUtils.isSorted;

public class SelectionSortTest {
    @Test
    public void testSort() {
        int[] arr = {9,8,7,6,5,4,12,13,2,1,1,2,3,5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        Assertions.assertTrue(isSorted(arr));
    }
}
