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
        Assertions.assertEquals(11, (bubbleSort.sortArray(new int[]{4, 82, 9, 99, 11, 90, 67})[1]));
        Assertions.assertNull(bubbleSort.sortArray(new int[]{}));
    }
}
