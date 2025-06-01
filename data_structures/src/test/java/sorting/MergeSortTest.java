package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static sorting.SortingUtils.isSorted;

public class MergeSortTest {
    @ParameterizedTest
    @MethodSource("getInputArray")
    public void testSort(int[] arr) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        Assertions.assertTrue(isSorted(arr));
    }
    
    /**
     * In MethodSource, the provided method needs to be static because MethodSource is
     * designed to work with factory methods that provide input data for parameterized tests.
     * These factory methods must be static so that they can be called directly from the test
     * class, without requiring a specific instance of the test class. This allows the test
     * runner to easily access the data provided by the factory method for each iteration
     * of the parameterized test.
     */
    private static Stream<Arguments> getInputArray() {
        return Stream.of(
                Arguments.of(new int[]{9, 8, 7, 6, 5, 4, 12, 13, 2, 1, 1, 2, 3, 5}),
                Arguments.of(new int[]{9, 8, 7, 6, 5}),
                Arguments.of(new int[]{9})
        );
    }
}
