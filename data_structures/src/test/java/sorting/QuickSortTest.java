package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static sorting.SortingUtils.isSorted;

public class QuickSortTest {
    @ParameterizedTest
    @MethodSource("getInputArray")
    public void testSort(int[] arr) {
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        Assertions.assertTrue(isSorted(arr));
    }
    
    private static Stream<Arguments> getInputArray() {
        return Stream.of(
                Arguments.of(new int[]{9, 8, 7, 6, 5, 4, 12, 13, 2, 1, 1, 2, 3, 5}),
                Arguments.of(new int[]{9, 8, 7, 6, 5}),
                Arguments.of(new int[]{9}),
                Arguments.of(new int[]{2,2,2,2,2,2,2,2,2})
        );
    }
}
