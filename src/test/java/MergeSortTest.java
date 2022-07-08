import com.sparta.Kira.MergeSort;
import com.sparta.Kira.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortTest {
    Sorter mergeSort;

    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    @DisplayName("Typical sort test")
    void testSort() {
        int[] sorted = new int[]{2, 3, 4, 7, 9, 11, 16, 23, 23, 24};
        int[] unsorted = new int[]{7, 3, 2, 16, 24, 4, 23, 11, 9, 23};
        Assertions.assertArrayEquals(sorted, mergeSort.sortArray(unsorted));
    }
    @Test
    @DisplayName("Empty array test")
    void testEmpty(){
        int[] empty = new int[0];
        Assertions.assertArrayEquals(empty, empty);
    }

    @Test
    @DisplayName("Uneven arrays")
    void testUneven(){
        int[] array1 = new int[]{99, 10, 76, 2, 82, 1};
        int[] array2 = new int[]{7, 22, 39, 10, 1, 29, 92, 95};
        int[] merged = new int[]{1, 1, 2, 7, 10, 10, 22, 29, 39, 76, 82, 92, 95, 99};
        Assertions.assertArrayEquals(merged, mergeSort.mergeArray(array1, array2));
    }
}