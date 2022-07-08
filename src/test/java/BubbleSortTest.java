import com.sparta.Kira.BubbleSort;
import com.sparta.Kira.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    Sorter bubbleSort;

    @BeforeEach
    void setUp(){bubbleSort = new BubbleSort();}

    @Test
    @DisplayName("Typical sort test")
    void testSort(){
        int[] unsorted = new int[]{4, 82, 9, 99, 11, 90, 67};
        int[] sorted = new int[]{4, 9, 11, 67, 82, 90, 99};
        Assertions.assertEquals(9, (bubbleSort.sortArray(new int[]{4, 82, 9, 99, 11, 90, 67})[1]));
        Assertions.assertEquals(82, (bubbleSort.sortArray(new int[]{4, 82, 9, 99, 11, 90, 67})[4]));
        Assertions.assertArrayEquals(sorted, bubbleSort.sortArray(unsorted));
    }

    @Test
    @DisplayName("Empty array test")
    void testEmpty(){
        Assertions.assertNull(bubbleSort.sortArray(new int[]{}));
    }
}
