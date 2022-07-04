import com.sparta.Kira.BubbleSort;
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
        int[] empty = new int[0];
        Assertions.assertArrayEquals(sorted, mergeSort.sortArray(unsorted));
        Assertions.assertArrayEquals(empty, empty);
    }
}